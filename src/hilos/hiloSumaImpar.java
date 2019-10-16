package hilos;

import Objetos.algoritmo;


public class hiloSumaImpar extends Thread{

    private algoritmo algoritmoLuhn;
    
    public hiloSumaImpar(algoritmo algLuhn) {
        super("Hilo SUMA IMPAR");
        this.algoritmoLuhn=algLuhn;
    }
    
    
    @Override
    public void run(){
        System.out.println("***** EJECUTANDOSE :"+super.getName());
        algoritmoLuhn.sumarImpares();   
    }
    
}
