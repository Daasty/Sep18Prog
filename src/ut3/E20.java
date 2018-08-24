package ut3;

import java.util.Scanner;

/*
Pedir dos números al usuario y decir los números que hay entre ellos formateados y sin importar el orden
 */
public class E20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el primer número:");
        int num1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Dime el segundo número:");
        int num2 = Integer.parseInt(teclado.nextLine());
        int cont = 7;
        if (num1 > num2) {
            int num3 = num1;
            num1 = num2;
            num2 = num3;
        }

        for (int i = num1; i <= num2; i++) {
            System.out.printf("%5d", i);
            if (i == num1 + cont) {
                System.out.println();
                cont += 8;
            }
        }
    }
}
