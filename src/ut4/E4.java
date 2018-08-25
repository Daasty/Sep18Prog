package ut4;

import java.util.Scanner;

/*
Pedir al usuario los extremos de un intervalo para mostrar una lista de posiciones dentro del intervalo en array ordenado
 */

public class E4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] datos = {25, 42, 56, 85, 94, 102, 112 ,120, 133 ,140 ,210};
        System.out.println("Dime el primer extremo: ");
        int interv1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Dime el segundo extremo: ");
        int interv2 = Integer.parseInt(teclado.nextLine());
        boolean sw = true;
        boolean sw2 = true;

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] > interv1 && datos[i] < interv2 && sw2) {
                System.out.printf("Posiciones de valores dentro del intervalo: \n");
                sw2 = false;
            }

            if (datos[i] > interv1 && datos[i] < interv2) {
                System.out.printf("Posición %d -> %d \n", i, datos[i]);
                sw = false;
            }
        }
        System.out.println();
        if (sw) {
            System.out.printf("No hay valores dentro del intervalo.");
        }
    }
}
