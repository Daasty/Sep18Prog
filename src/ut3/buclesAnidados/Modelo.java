package ut3.buclesAnidados;

import java.util.Scanner;
/*
Pide al usuario un número del 1 al 9 para mostrar una figura
 */
public class Modelo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número del 1 al 9: ");
        int num = Integer.parseInt(teclado.nextLine());

        if (num >= 1 && num <= 9) {
            for (int i = 0; i <= num; i++) {
                for (int j = 0; j <= num; j++) {
                    System.out.printf("(%d, %d)", i, j);
                }
                System.out.println();
            }
        }
    }
}
