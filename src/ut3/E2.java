package ut3;

import java.util.Scanner;

/*
Dime un número y te diré si es par
 */
public class E2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número y te diré si es par");

        int num = teclado.nextInt();
        if(num % 2 == 0) {
            System.out.println("Es par");
        }
        else System.out.println("Es impar");
    }
}
