/*
Números primos 
Este programa imprime todos los números primos entre el 1 y el 30.
 */
package Programa;

public class   Programa01 {

    public static void main(String[] args) {
        System.out.println("Numeros primos entre 1 y 30:");
        
        for (int i = 2; i <= 30; i++) {
            boolean esPrimo = true;
            
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            
            if (esPrimo) {
                System.out.println(i);
            }
        }
    }
}