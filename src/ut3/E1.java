package ut3;

import java.util.Scanner;

/*
Dime dos números para sumarlos
 */
public class E1 {
    public static void main (String[] args) {
        System.out.println("Dime dos números para sumarlos");
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        int sum = num1 + num2;

        System.out.println("La suma es: " + sum);

    }
}
