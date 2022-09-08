package com.example.sprint3dllSoftware.entidades;

public class Empresa {
    protected String NombreEmpresa;
    protected String DireccionEmpresa;
    protected String NumeroDeTelefono;
    protected String IdEmpresa;


    public Empresa(String nombreEmpresa, String direccionEmpresa, String numeroDeTelefono, String idEmpresa) {
        NombreEmpresa = nombreEmpresa;
        DireccionEmpresa = direccionEmpresa;
        NumeroDeTelefono = numeroDeTelefono;
        IdEmpresa = idEmpresa;
    }

    public Empresa() {
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

    public String getIdEmpresa() {
        return IdEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        IdEmpresa = idEmpresa;
    }
}
