package com.example.sprint3dllSoftware.entidades;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rol_empleado")
public class RolEmp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @Column(name = "tipo", length = 20)
    public String tipo;

    //Un rol puede asociarse a muchos empleados
    @JoinColumn(name="employee_id")
    @OneToMany(mappedBy = "rol_empleado", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employee> employees;

    public RolEmp(long id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }
    public RolEmp() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}