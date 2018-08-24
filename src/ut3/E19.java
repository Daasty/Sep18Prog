package ut3;

import java.util.Scanner;
/*
Pedir al usuario un número y decir los divisores de este
 */
public class E19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número y te diré los divisores de este: ");
        int num = Integer.parseInt(teclado.nextLine());
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.printf("%d, ", i);
            }
        }
    }
}
