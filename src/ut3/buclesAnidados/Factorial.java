package ut3.buclesAnidados;

import java.util.Scanner;
/*
Pedir al usuario 6 números y mostrar el factorial de todos ellos
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime 6 números: ");
        int[] num = new int[6];

        for (int i = 0; i <= 5; i++) {
            System.out.printf("Número %d: ", i + 1);
            num[i] = Integer.parseInt(teclado.nextLine());
        }

        for (int j = 0; j <= 5; j++) {
            int numFact = 1;
            System.out.printf("%d! = 1", num[j]);

                for (int k = 2; k <= num[j]; k++) {
                    numFact *= k;
                    System.out.printf(" x %d", k);

                System.out.printf(" = %d\n", numFact);
            }
        }
    }
}
