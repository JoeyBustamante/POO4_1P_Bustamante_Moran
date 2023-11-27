
package com.mycompany.proyecto1p;
import java.util.Scanner;
import java.util.Random;
public abstract class Servicios extends Cliente{
    private int numeroServicio;
    private String tipoDeServicio;
    String cedulaCliente;
    String nombreConductor;
    private String desde;
    private String hasta;
    String fecha;
    private String hora;
    
    
    
    
    public Servicios(String fecha,String nombreConductor,double valorAPagar){
        this.fecha=fecha;
        this.nombreConductor=nombreConductor;
    }
    public Servicios(){
        
    }
    
    public abstract void calcularValorAPgagar(String fecha);
      
    
}
