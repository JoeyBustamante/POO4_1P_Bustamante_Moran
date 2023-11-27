
package com.mycompany.proyecto1p;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Taxi extends Servicios {
   private int numeroPersonas;
   private final double costoPorKM=0.50;
   private String hasta;
   
  
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
        Scanner sc2=new Scanner(System.in);
        System.out.println("Cuantas personas van a Viajar: ");
        int numPersonas=sc.nextInt();
        
        Random randomKM =new Random();
        double nRandomKM=randomKM.nextInt(41)+5;
        double subTotal=nRandomKM*costoPorKM;
        
        System.out.println("El subtotal es "+ subTotal+" desea confirmar el viaje?");
        
        String confirmacion=sc2.nextLine();
        
        System.out.println("Cual es la forma de pago: T o E");
        String metodoP=sc2.nextLine();
        
        if (confirmacion.equals("si")){
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

            String clientesArchivo = "viajes.txt";
            String lineaAEscribir = "\n"+nRandom+","+numPersonas+"," + nRandomKM+","+subTotal;
            ManejoArchivos.EscribirArchivo(clientesArchivo, lineaAEscribir);

            String pagosArchivo = "pagos.txt";
            String Escribir = "\n"+nRandom+","+fecha+","+nRandom+","+metodoP+","+cedula+","+subTotal+","+total;
            ManejoArchivos.EscribirArchivo(pagosArchivo, Escribir);
            
            String ServiciosArchivo = "Servicios.txt";
            String Escribir3 = "\n"+nRandom+","+"Taxi"+","+cedula+","+nombreConductore+","+ desde +","+ hasta+","+hora + ","+subTotal+","+total;
            ManejoArchivos.EscribirArchivo(ServiciosArchivo, Escribir3);
            
            System.out.println("----------"+"Detelles del servicio"+"----------");
            System.out.println("Numero de servicio: "+nRandom);
            System.out.println("Numero de pasajeros: "+numPersonas);
            System.out.println("Distancia kilometros: "+nRandomKM);
            System.out.println("Subtotal: "+subTotal);
            System.out.println("Total: "+total);
            
            
        }
      
        
        
    }
    
}    
   