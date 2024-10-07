/*
Suma de los cuadrados de los primeros 5 números
Este programa calcula la suma de los cuadrados de los números del 1 al 5.
 */
package Programa;

public class Programa02 {

    public static void main(String[] args) {

        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            suma += i * i;
        }
        System.out.println("La suma de los cuadrados es: " + suma);
    }
}