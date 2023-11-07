
package com.mycompany.proyectopoo;

public class Usuario {
    private String cedula;
    private String nombre;
    private String apellido;
    private String user;
    private String contraseña;
    private String numeroCelular;
    private String tipoDeUsuario;
    
    
    public Usuario(String cedula,String nombre, String apellido, String user,String contraseña,String numeroCelular,String tipoDeUsuario){
        this.cedula=cedula;
        this.nombre=nombre;
        this.apellido=apellido;
        this.user=user;
        this.contraseña=contraseña;
        this.numeroCelular=numeroCelular;
        this.tipoDeUsuario=tipoDeUsuario;
    }
 //GETTERS
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUser() {
        return user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }
    
    //SETTERS

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }
    
    
}
