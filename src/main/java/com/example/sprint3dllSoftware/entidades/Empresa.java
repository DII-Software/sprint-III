package com.example.sprint3dllSoftware.entidades;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    @Column(name = "nombreEmpresa", length = 50)
    protected String NombreEmpresa;
    @Column(name = "direccionEmpresa", length = 50)
    protected String DireccionEmpresa;
    @Column(name = "numeroTelefono", length = 10)
    protected String NumeroDeTelefono;

    //Una empresa puede tener muchos empleados
    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employee> employees;



    public Empresa(int id, String nombreEmpresa, String direccionEmpresa, String numeroDeTelefono) {
        id = id;
        NombreEmpresa = nombreEmpresa;
        DireccionEmpresa = direccionEmpresa;
        NumeroDeTelefono = numeroDeTelefono;
    }

    public Empresa() {
    }

    public int  getIdEmpresa() {return id;}
    public void setIdEmpresa(int id) {
        id = id;
    }
    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        NombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return DireccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        DireccionEmpresa = direccionEmpresa;
    }

    public String getNumeroDeTelefono() {
        return NumeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        NumeroDeTelefono = numeroDeTelefono;
    }

}