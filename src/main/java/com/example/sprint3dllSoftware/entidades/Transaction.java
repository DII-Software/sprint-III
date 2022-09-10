package com.example.sprint3dllSoftware.entidades;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Transaction {
    @Id
    @Column(name = "id_transaction")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idTransaction;
    public String concept;
    public float amount;

    @ManyToOne()
    @JoinColumn(name = "id_employee")
    private Employee employee;

    @ManyToOne()
    @JoinColumn(name="id_empresa")
    private Empresa empresa;
    @Column(name = "created_at")
    public Date createdAt;
    @Column(name = "updated_at")
    public Date updatedAt;

    public Transaction(long idTransaction, String concept, float amount, Employee employee, Empresa empresa, Date createdAt, Date updatedAt) {
        this.idTransaction = idTransaction;
        this.concept = concept;
        this.amount = amount;
        this.employee = employee;
        this.empresa = empresa;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Transaction() {
    }

    public long getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(long idTransaction) {
        this.idTransaction = idTransaction;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
