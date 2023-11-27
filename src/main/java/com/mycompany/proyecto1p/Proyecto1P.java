
package com.mycompany.proyecto1p;

public class Proyecto1P {

    public static void main(String[] args) {
        System.out.println("+++++++++++++++++++++++++++++++++++"+"\n");
        System.out.println("       Bienvenido al sistema       "+"\n");
        System.out.println("+++++++++++++++++++++++++++++++++++"+"\n");
        
        
        Usuario userP=new Usuario();
        Cliente cl1=new Cliente();
        
        
        Usuario userA=userP.verificar();
        if (userA!=null){
           if (cl1.verificarCliente(userA)==true){
            cl1.solicitarServicio(cl1.tiposDeServicio()); 
        }
        
            
            
             
        }
        
       
        
    }
    
    
    
}
