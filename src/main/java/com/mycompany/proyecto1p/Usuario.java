
package com.mycompany.proyecto1p;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    String cedula;
    String nombre;
    String apellido;
    String user;
    String contraseña;
    String numeroCelular;
    String tipoDeUsuario;
    
    
    public Usuario(){
        
    }
    
    
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
    
    public Usuario verificar(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Escriba su usuario: ");
        String usu=sc.nextLine();
        System.out.print("Escriba su contraseña: ");
        String contra=sc.nextLine();
        
        String nombreArchivo ="usuarios.txt";
        ArrayList<String> lineas=ManejoArchivos.LeeFichero("usuarios.txt");
        int llave=0;
        Usuario user1=null;
        Usuario userF=null;
        
        for (String linea:lineas){
            String[] sep=linea.split(",");
            String cedula=sep[0];
            String nombre=sep[1];
            String apellido=sep[2];
            String user=sep[3];
            String contraseña=sep[4];
            String numeroCelular=sep[5];
            String tipoDeUsuario=sep[6];
            
            if(usu.equals(user) && (contra.equals(contraseña))){
                user1=new Usuario(cedula,nombre,apellido,user,contraseña,numeroCelular,tipoDeUsuario);
                llave++;
                
            
            }
        }
        if (llave==1){
            System.out.println("Acceso concedido");
            return user1;
        }
        else{
            System.out.println("Acceso denegado");
            return userF;
        }
        
    }
    
    
    public void servicioTaxi(){
        
    }
    
    
    
}