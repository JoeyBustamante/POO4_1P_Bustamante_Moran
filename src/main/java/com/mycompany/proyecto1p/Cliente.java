
package com.mycompany.proyecto1p;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Usuario{
    String numeroDeTarjeta;
    String edad;
    public Cliente(String numeroDeTarjeta,String edad){
        this.numeroDeTarjeta=numeroDeTarjeta;
        this.edad=edad;
    }
    
    public Cliente(){
        
    }
    
    public boolean verificarCliente(Usuario user){
        String clientesA ="clientes.txt";
        ArrayList<String> lineas=ManejoArchivos.LeeFichero(clientesA);
        int acceso=0;
        for(String linea: lineas){
            String[] sepa=linea.split(",");
            String numeroCedula=sepa[0];
            String edad=sepa[1];
            String tarjetaDeCredito=sepa[2];
            if (user.cedula.equals(numeroCedula)){
                acceso++;
            }    
        }
        if (acceso==1){
            return true;
        }
        else{
            System.out.println("Sus datos no constan en el sistema, por favor ingresarlos");
            Scanner sc=new Scanner(System.in);
            System.out.println("Ingrese su numero de tarjeta");
            numeroDeTarjeta=sc.nextLine();
            System.out.println("Ingrese su edad");
            edad=sc.nextLine();
            Cliente clp=new Cliente(numeroDeTarjeta,edad);
            String clientesArchivo = "clientes.txt";
            String lineaAEscribir = "\n"+user.cedula+","+edad+","+numeroDeTarjeta;
            ManejoArchivos.EscribirArchivo(clientesArchivo, lineaAEscribir);
            return true;
            
        }
        
    }
    public int tiposDeServicio(){
        System.out.println("1. Solicitar servicio de taxi");
       // System.out.println("2. Solicitar comida a domicilio");
        System.out.println("3. Solicitar entrega encomienda");
        System.out.println("4. consultar servicios");
        Scanner sc=new Scanner(System.in);
        System.out.print("Elija una opcion: ");
        int Opcion=sc.nextInt();
        return Opcion;
        
    }
    
    public String solicitarServicio(int opcion){ 
        Scanner sc=new Scanner(System.in);
        System.out.println("Fecha de viaje: ");
        String fecha1=sc.nextLine();
        
        if (opcion==1){
            Taxi taxi=new Taxi();
            taxi.calcularValorAPgagar(fecha1);
        }
        else if(opcion==3){
            Encomienda encomienda=new Encomienda();
            encomienda.calcularValorAPgagar(fecha1);
        }
        else if(opcion==4){
            ConsultarServicios consulta=new ConsultarServicios();
            consulta.consultarServicios();
        }
        
        
        return fecha1;
        
        
        
    }
    
    
    
    
    
    
    
    
}
