package ut3;

import java.util.Scanner;
/*
Pedir un número entero mayor que 0 y decir cuántos bytes harían falta para representarlo
 */
public class E11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número entero y te diré los bites que ocupa");
        int num = Integer.parseInt(teclado.nextLine());
        int bits = 1;
        while (num > Math.pow(2, bits) - 1) {
            bits++;
        }
        System.out.println("Los bits que ocupa son " + bits + " bits.");
    }
}
