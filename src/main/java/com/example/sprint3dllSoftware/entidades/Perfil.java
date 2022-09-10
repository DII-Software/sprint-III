package com.example.sprint3dllSoftware.entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(name = "image", length = 10)
    public String image;
    @Column(name = "phone", length = 10)
    public String phone;
    public String user;
    @Column(name = "created_at")
    public Date createdAt;
    @Column(name = "updated_at")
    public Date UpdatedAt;

    //Un perfil solo debe asociarse a un empleado
    @OneToOne(mappedBy = "perfil", cascade = CascadeType.ALL, orphanRemoval = true)
    @PrimaryKeyJoinColumn
    private Employee employee;


    public Perfil(int id, String image, String phone, String user, Date createdAt, Date updatedAt) {
        this.id = id;
        this.image = image;
        this.phone = phone;
        this.user = user;
        this.createdAt = createdAt;
        UpdatedAt = updatedAt;
    }
    public Perfil() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        UpdatedAt = updatedAt;
    }
}