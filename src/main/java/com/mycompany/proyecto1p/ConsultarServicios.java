
package com.mycompany.proyecto1p;

import java.util.ArrayList;

public class ConsultarServicios {
    String nombreArchivo ="Servicios.txt";
    ArrayList<String> lineas=ManejoArchivos.LeeFichero(nombreArchivo);
public ConsultarServicios(){
    
}    

public void consultarServicios(){    
    
    
    
    for (String linea:lineas){
        String[] sep=linea.split(",");
        String numeroE=sep[0];
        String tipo=sep[1];
        String cedulaC=sep[2];
        String nombreCon=sep[3];
        String desde=sep[4];
        String hasta=sep[5];
        String hora=sep[6];
        
        
        System.out.println("----------"+"Detelles del servicio"+"----------");
            System.out.println("Numero de servicio: "+numeroE);
            System.out.println("Tipo de servicio: "+tipo);
            System.out.println("Cedula del cliente: "+cedulaC);
            System.out.println("Nombre del conductor "+nombreCon);
            System.out.println("Desde: "+desde);
            System.out.println("Hasta: "+hasta);
            System.out.println("Hora: "+hora);
            
        System.out.println("-----------------------------------------------");
    }    



}

}
