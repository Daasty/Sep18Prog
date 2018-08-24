package ut3;

import java.util.Scanner;
/*
Programa que diga los números entre 1 y el que diga el usuario
 */
public class E3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 1;
        System.out.println("Introduce el número máximo");
        int numUsr = teclado.nextInt();
        while (num <= numUsr) {
            System.out.print(num++);
        }
    }
}
