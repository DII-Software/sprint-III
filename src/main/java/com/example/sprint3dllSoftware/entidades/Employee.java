package com.example.sprint3dllSoftware.entidades;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="employee")
public class Employee {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Integer idEmpleado;
    @Column(nullable = false, length = 60)
    private String nombre;
    @Column(nullable = false, length = 30, unique = true)
    private String correo;

    @Column(nullable = false, length = 20, unique = true)
    private String username;

    @Column(nullable = false, length = 10)
    private String password;

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;

//    @ManyToOne
//    @JoinColumn(name = "id_rol")
//    private RolEmp rol;

    //un empleado puede hacer muchas transacciones
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaction> transactions;

    //Los empleados solo pueden asociarse a un rol
    @ManyToOne()
    @JoinColumn(name = "rolEmp_id")
    private RolEmp rolEmp;

    //Los empleados deben pertener a una empresa
//    @ManyToOne()
//    @JoinColumn(name = "empresa_id")
//    private Employee employee;

    //Constructor
    public Employee(Integer idEmpleado, String nombre, String correo, String username, String password, Empresa empresa, RolEmp rolEmp, List<Transaction> transactions) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.correo = correo;
        this.username = username;
        this.password = password;
        this.empresa = empresa;
        this.rolEmp = rolEmp;
        this.transactions = transactions;
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

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public RolEmp getRol() {
        return rolEmp;
    }

    public List<Transaction> getTransactions() {
        return transactions;
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

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void setRol(RolEmp rolEmp) {
        this.rolEmp = rolEmp;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}