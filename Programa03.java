/*
Crear un programa que te genere un patrón de asteriscos
Este programa imprime un Cuadrado de asteriscos con 20 filas.
 */
package Programa;
public class Programa03 {
 public static void main(String[] args) {
        int size = 20; // Tamaño del cuadrado
        
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}