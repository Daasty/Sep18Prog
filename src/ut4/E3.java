package ut4;

import java.util.Scanner;

/*
Pedir al usuario los extremos de un intervalo para mostrar una lista de posiciones fuera del intervalo en array desordenado
 */
public class E3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] datos = {120, 130, 111, 150, 164, 143, 138, 189, 162, 127};
        System.out.println("Dime el primer número del intervalo: ");
        int interv1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Dime el segundo número del intervalo: ");
        int interv2 = Integer.parseInt(teclado.nextLine());

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] < interv1 || datos[i] > interv2) {
                System.out.printf("Valor: %d -> posición %d\n", datos[i], i);
            }
        }
    }
}
