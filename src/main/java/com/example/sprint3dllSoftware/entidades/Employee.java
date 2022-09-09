package com.example.sprint3dllSoftware.entidades;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Employee")

public class Employee {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmpleado;
    @Column (nullable = false, length = 60)
    private String nombre;
    @Column (nullable = false, length = 30, unique = true)
    private String correo;
    @ManyToOne
        @JoinColumn(name = "id_empresa")
        Empresa empresa;
    @ManyToOne
        @JoinColumn(name = "id_rol")
        RolEmp rol;

    //un empleado puede hacer muchas transacciones
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaction> transactions;

    //Los empleados solo pueden asociarse a un rol
    @ManyToOne()
    @JoinColumn(name = "rolEmp_id")
    private RolEmp rolEmp;

    //Los empleados deben pertener a una empresa
    @ManyToOne()
    @JoinColumn(name = "empresa_id")
    private Employee employee;

    //Un empleado solo debe tener un usr
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private User user;

    //Un empleado solo debe tener un perfil
    @OneToOne(mappedBy = "perfil", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Perfil perfil;


    //Constructor


    public Employee(Integer idEmpleado, String nombre, String correo, Empresa empresa, RolEmp rol) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
    }

    public Employee() {

    }

    //Getters


    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public RolEmp getRol() {
        return rol;
    }

    //Setters


    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void setRol(RolEmp rol) {
        this.rol = rol;
    }
};

