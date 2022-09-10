package com.example.sprint3dllSoftware.entidades;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Empresa")
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

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, orphanRemoval = true)
            private List<Transaction> transaction;

    public Empresa(int id, String nombreEmpresa, String direccionEmpresa, String numeroDeTelefono, List<Employee> employees, List<Transaction> transaction) {
        this.id = id;
        NombreEmpresa = nombreEmpresa;
        DireccionEmpresa = direccionEmpresa;
        NumeroDeTelefono = numeroDeTelefono;
        this.employees = employees;
        this.transaction = transaction;
    }

    public Empresa() {
    }

    public int getId(Empresa empr) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }
}