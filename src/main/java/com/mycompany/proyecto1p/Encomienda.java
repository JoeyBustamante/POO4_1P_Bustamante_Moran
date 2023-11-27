
package com.mycompany.proyecto1p;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Encomienda extends Servicios{
    private int cantidadProductos;
    private double pesoKg;
    private String tipoEncomienda;
    private final int valorCarrera=4;
    
    public Encomienda(){
        
    }
    

    @Override
    public void calcularValorAPgagar(String fecha) {
        Scanner sc5=new Scanner(System.in);
        System.out.println("Desde donde desea ir: ");
        String desde=sc5.nextLine();
        System.out.println("Hasta donde quiere ir: ");
        String hasta=sc5.nextLine();
        System.out.println("Hora del viaje: ");
        String hora=sc5.nextLine();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Tarjeta (T) o efectivo (E)");
        String tarjetaOEfectivo=sc.nextLine();
        System.out.println("Tipo de encomienda: ");
        String tipoDeEncomienda=sc.nextLine();
        System.out.println("Cantidad de Productos: ");
        int cantidadProductos=sc.nextInt();
        System.out.println("Peso en Kg: ");
        int peso=sc.nextInt();
        System.out.print("Valor a pagar: ");
        double subTotal=4+1*cantidadProductos;
        System.out.println("Cual es la forma de pago: T o E");
        String metodoP=sc.nextLine();
        
        
            String nombreArchivo ="usuarios.txt";
            ArrayList<String> lineas=ManejoArchivos.LeeFichero("usuarios.txt");
            String tipoDeUsuario=null;
            String nombreConductore=null;
            String cedula=null;
            for (String linea:lineas){
                String[] sep=linea.split(",");
                tipoDeUsuario=sep[6];
                if (tipoDeUsuario.equals("C")){
                    nombreConductore=sep[1]+sep[2];
                    cedula=sep[0];
                
                }

            }  
            double total=subTotal;
            if(metodoP.equals("T")){
                total=subTotal*0.15+subTotal;
            }
            
            Random random =new Random();
     
            int nRandom=random.nextInt(1000)+9000;
            
            String EncomiendasArchivo = "Encomiendas.txt";
            String Escribir3 = "\n"+nRandom+","+"Encomienda"+","+cantidadProductos+","+peso+","+subTotal+","+total;
            ManejoArchivos.EscribirArchivo(EncomiendasArchivo, Escribir3);
            
            String ServiciosArchivo = "Servicios.txt";
            String Escribir4 = "\n"+nRandom+","+"Encomienda"+","+cedula+","+nombreConductore+","+ desde +","+ hasta+","+hora + ","+subTotal+","+total;
            ManejoArchivos.EscribirArchivo(ServiciosArchivo, Escribir4);
            
            System.out.println("----------"+"Detelles del servicio"+"----------");
            System.out.println("Numero de servicio: "+nRandom);
            System.out.println("Tipo de servicio: "+"Encomienda");
            System.out.println("Cantidad de productos: "+cantidadProductos);
            System.out.println("Peso en Kg: "+peso);
            System.out.println("Subtotal: "+subTotal);
            System.out.println("Total: "+total);
       
    
    
    }        
        
    
}
