package com.example.sprint3dllSoftware.entidades;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")

public class Employee {
    //Atributos
    @Id
    private Integer idEmpleado;
    @Column (nullable = false, length = 60)
    private String nombre;
    @Column (nullable = false, length = 30, unique = true)
    private String correo;
    @Column (nullable = false, length = 30)
    private Empresa empresa;
    @Column(nullable = false, length = 30)
    private RolEmp rol;

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

