
package Objetos;

//<editor-fold defaultstate="collapsed" desc="Librerias y Componentes(Dependencias)Importadas"> 
import interfaces.lunh;
//</editor-fold>

public class algoritmo implements lunh{
   
 //<editor-fold defaultstate="collapsed" desc="VARIABLES DEL PROGRAMA">   
    public int digitos[]= {1,9,3,6,9,1,5,3,4,6,7,8,3,4,6,0};
    int aux_suma;
    int aux_multi;
    boolean digitoValidado;
    boolean sumaImparCompleta;
    boolean sumaParCompleta;
    boolean digitosVacios;
    
 ///</editor-fold>
    
 //<editor-fold defaultstate="collapsed" desc="METODO CONSTRUCTOR">   
    public algoritmo() {        
     this.digitoValidado =false;
     aux_multi=0;
     this.sumaImparCompleta=false;
     this.sumaParCompleta=false;
     
    }
 ///</editor-fold>
      
   
    public boolean verficarDigitos() {
        if(aux_suma==0){
            digitoValidado=false;
        }
        
        
        
        return false;
    }

    @Override
    public  synchronized void sumarImpares() {
        for(int punteroArreglo=1;punteroArreglo<digitos.length-1;punteroArreglo=punteroArreglo+2){
            System.out.println("Pocicion [ "+punteroArreglo+ "] : " +digitos[punteroArreglo] + " SUMA HASTA ESTE DIGITO:" +aux_suma);
           // aux_suma_impar=aux_suma_impar+digitos[punteroArreglo];
            aux_suma=aux_suma+digitos[punteroArreglo];
        }
         }
       

    @Override
    public synchronized void  sumarPares() {
    int var=digitos.length-2;   
    while(var>=0){
            System.out.println("Pocicion [ "+var+ "] : " +digitos[var]);
            aux_multi=digitos[var]*2;
           System.out.println(" MULTIPLICADO POR DOS "+aux_multi+"HASTA AHORA LA SUMA ES "+aux_suma);
            if(aux_multi>9){
                
                aux_multi=aux_multi-9;
            }
            //aux_suma_par=aux_suma_par+aux_multi;
            aux_suma=aux_suma+aux_multi;
            var =var-2;
        }
   
        
        
    }
    
     
    
    
     
}
