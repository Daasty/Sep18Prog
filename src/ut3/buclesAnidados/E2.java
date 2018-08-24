package ut3.buclesAnidados;

import java.util.Scanner;
/*
Pide 8 números para mostrar tantos asteriscos como indique el número
 */
public class E2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime 8 números");
        for (int i = 1; i <= 8; i++) {
            int num = Integer.parseInt(teclado.nextLine());
            System.out.printf("Número %d: \n", i);
            for (int j = 1; j <= num; j++) {
                System.out.printf("*");
            }
            System.out.printf("[%d ast.]\n", num);
        }

    }
}