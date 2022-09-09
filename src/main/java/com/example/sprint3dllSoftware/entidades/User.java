package com.example.sprint3dllSoftware.entidades;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table
public class User {

    @Id
    @Column(name = "id_user")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idUser;
    public String username;
    public String email;
    public String password;

    //Un usuario solo debe asociarse a un empleado
    @JoinColumn(name = "employee_id")
    @OneToOne(fetch = FetchType.LAZY)
    private Employee employee;

    public User(int idUser, String username, String email, String password) {
        this.idUser = idUser;
        this.username = username;
        this.email = email;
        this.password = password;
    }
    public User() {
    }

    public int getId_user() {
        return idUser;
    }

    public void setId_user(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
