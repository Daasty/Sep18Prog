package ut3.buclesAnidados;

import java.util.Scanner;
/*
Pedir un número entre 1 y 9 al usuario para mostrar una figura
 */
public class E6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número del 1 al 9: ");
        int num = Integer.parseInt(teclado.nextLine());

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%3d", j);
            }
            System.out.println();
        }
    }
}
