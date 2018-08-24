package ut3;

import java.util.Scanner;
/*
Pedir 3 números al usuario para decir cuál es el más pequeño
 */
public class E14 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime 3 números y te diré el más pequenio: ");
        System.out.println("Primer número: ");
        int num1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Segundo número: ");
        int num2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Tercer número: ");
        int num3 = Integer.parseInt(teclado.nextLine());

        if (num1 < num2 && num1 < num3) {
            System.out.println("El menor es el primero, el " + num1);
        }
        else if (num2 < num1 && num2 < num3) {
            System.out.println("El menor es el segundo, el " + num2);
        }
        else System.out.println("El menor es el tercero, el " + num3);
    }
}
