package interfaces;

public interface lunh { // la interfaz del  luhn se basa en tareas principales que se realizan
                        // durante la resolucion del algoritmo de lunh o modulo 10

   
  
                     
    public boolean verficarDigitos(); //Verifica el digito resultante de la operacion ,Para validar
                                        //que los digitos sean correctos ,divide el resultante en modular 10
    
    public void sumarImpares(); //Suma los numeros IMPARES de manera secuencial en los digitos (arreglo)
    
    public void sumarPares();   //Suma los numeros PARES de derecha a izquierda ,cada numero se multiplica
                                 // por dos antes de sumarse ,si es un numero de dos cifras se le restan 9
                                 // o se suman ambos digitos en el numero resultante ,este resultado se adiciona
                                 // a la suma de IMPARES
}
