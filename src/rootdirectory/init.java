package rootdirectory;

import Objetos.algoritmo;
import hilos.*;

public class init {
    public static void main(String[] args) {
        
        algoritmo nuevaVerificacionDigito = new algoritmo();
         hiloSumaImpar  sumarImpares= new hiloSumaImpar(nuevaVerificacionDigito);
        hiloSumaPares  sumarPares= new hiloSumaPares(nuevaVerificacionDigito);
        sumarImpares.start();
        sumarPares.start();
        
    }
    
}
