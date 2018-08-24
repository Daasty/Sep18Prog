package ut3;

import java.util.Scanner;
/*
Prog que pida el peso en kg y la altura en metros para calcular el imc
 */
public class E6 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu peso en kg");
        int peso = Integer.parseInt(teclado.nextLine());
        System.out.println("Dime tu altura en metros");
        double altura = Double.parseDouble(teclado.nextLine());

        double imc = peso / Math.pow(altura, 2);

        if (imc >= 18 && imc <= 25) {
            System.out.println("Tu IMC es " + imc + ", que está en lo normal.");
        }
        else System.out.println("Tu imc es " + imc + ", que no está en lo normal.");
    }
}
