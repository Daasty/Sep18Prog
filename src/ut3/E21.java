package ut3;

import java.util.Scanner;
/*
Pedir un número al usuario para hacer la serie de Collatz
 */
public class E21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número: ");
        int num = Integer.parseInt(teclado.nextLine());

        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
                System.out.printf("%4d", num);
            }
            if (num % 2 != 0 && num != 1) {
                num = num * 3 + 1;
                System.out.printf("%4d", num);
            }

        }

    }
}
