package ut3;

import java.util.Scanner;
/*
Pedir al usuario un número mayor que 0 para decir el factorial
 */
public class E13 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número mayor que 0 y te diré el factorial");
        int num = Integer.parseInt(teclado.nextLine());
        int numFact = 1;
        System.out.printf("%d! = 1", num);
        if (num > 0) {
            for (int i = 2; i <= num; i++) {
                numFact *= i;
                System.out.printf(" x %d", i);
            }
            System.out.printf(" = %d", numFact);
        }
        else System.out.println("Introduce un número válido");

    }
}
