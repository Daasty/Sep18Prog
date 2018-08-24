package ut3;

import java.util.Scanner;

/*
Programa que diga mensajes. Soy negativo. Soy el cero. Estoy entre el 1 y el 100. Soy mayor que 100.
 */
public class E8 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número:");
        int num = Integer.parseInt(teclado.nextLine());

        if (num < 0) {
            System.out.println("Soy negativo");
        }
        if (num == 0) {
            System.out.println("Soy el cero");
        }
        if (num >= 1 && num <= 100) {
            System.out.println("Estoy entre el 1 y el 100");
        }
        if (num > 100) {
            System.out.println("Soy mayor que 100");
        }

    }
}
