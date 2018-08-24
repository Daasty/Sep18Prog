package ut3;

import java.util.Scanner;

/*
Pedir 6 números al usuario para mostrar la suma de todos ellos
 */
public class E4 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime 6 números");
        int total = 0;
        for (int i = 1; i <= 6; i++) {
            total += teclado.nextInt();
        }
        System.out.println("La suma es: " + total);
    }
}
