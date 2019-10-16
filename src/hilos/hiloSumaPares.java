
package hilos;

import Objetos.algoritmo;


public class hiloSumaPares extends Thread{

     private algoritmo algoritmoLuhn;
    
    public hiloSumaPares(algoritmo algLuhn) {
        super("Hilo SUMA PARES");
        this.algoritmoLuhn=algLuhn;
    }
    
    
    @Override
    public void run(){
         System.out.println(" EJECUTANDOSE :"+super.getName()+"++++");
        algoritmoLuhn.sumarPares();
   
    }
    }    
        
