package ut3;

import java.util.Scanner;
/*
Programa que genere las n primeras potencias de 2
 */
public class E16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Número de potencias: ");
        int num = Integer.parseInt(teclado.nextLine());

        for (int i = 0; i <= num; i++) {
            System.out.printf("2^%d = %.0f\n", i, Math.pow(2, i));
        }
    }
}
