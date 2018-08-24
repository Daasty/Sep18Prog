package ut3;

import java.util.Scanner;

/*
Pedir al usuario un número a ver si es positivo, negativo o es 0
 */
public class Modelo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número:");
        int num = Integer.parseInt(teclado.nextLine());
        if (num == 0) {
            System.out.println("El número es cero");
        }
        else if (num > 0) {
            System.out.println("El número es positivo");
        }
        else System.out.println("El número es negativo");
    }
}
