package ut2;

import java.util.Scanner;

/*
Pida un número entero al usuario para mostrar todos los mensajes que correspondan
Soy un número par mayor que 100
Soy un número par mayor que 1000
Soy el cero
Soy impar
Soy el 101
 */
public class E4 {
    public static void main(String[] args) {
        System.out.println("Dime un número y te diré los mensajes correspondientes:");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();

        if (num == 0) {
            System.out.println("Soy el cero");
        } else if (num % 2 == 0 && num >= 100) {
            System.out.println("Soy un número par mayor que 100");
            if (num % 2 == 0 && num >= 1000) {
                System.out.println("Soy un número par mayor que 1000");
            }
        } else if (num % 2 != 0) {
            System.out.println("Soy impar");
        } else if (num == 101) {
            System.out.println("Soy el 101");
        }
    }
}
