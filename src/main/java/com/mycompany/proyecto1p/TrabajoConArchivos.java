
package com.mycompany.proyecto1p;
import java.util.Calendar;
import java.util.Date;

public class TrabajoConArchivos {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] arg) {
        
        ManejoArchivos.LeeFichero("archivo.txt");
        Date today = Calendar.getInstance().getTime();
         System.out.println(today);
        
        
    }
    
}
