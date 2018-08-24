package ut3;

import java.util.Scanner;
/*
Programa que diga mensajes. Soy mayor que 100. Soy mayor que 1000. Soy mayor de 10000. Soy otro número.
 */
public class E9 {
    public static void main(String[] args) {
        System.out.println("Dime un número:");
        Scanner teclado = new Scanner(System.in);
        int num = Integer.parseInt(teclado.nextLine());

        if (num < 100) {
            System.out.println("Soy otro número");
        }
        if (num >= 100) {
            System.out.println("Soy mayor que 100");
        }
        if (num >= 1000) {
            System.out.println("Soy mayor que 1000");
        }
        if (num >= 10000) {
            System.out.println("Soy mayor que 10000");
        }
    }
}
