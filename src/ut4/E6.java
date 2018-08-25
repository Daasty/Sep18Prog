package ut4;

import java.util.Scanner;

/*
Pedir al usuario un número para indicar si está o no en el array usando búsqueda binaria.
Primero con la solución de los apuntes(6.3), luego con traza
 */
public class E6 {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        int[] array = {4, 8, 10, 15, 17, 21, 28, 31, 33, 39, 45, 48, 49, 52};
        System.out.println("Dime un número y lo buscaré: ");
        int num = Integer.parseInt(teclado.nextLine());
    }
}
