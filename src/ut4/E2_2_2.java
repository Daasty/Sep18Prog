package ut4;

import java.util.Scanner;

/*
Prog que pida al usuario un número a ver si está en un array cargado por código. Debe mostrar la primera posición
en la que se encuentra. La primera versión tiene valores desordenados y en la segunda ordenados. Con traza.
 */

public class E2_2_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] array = {2, 3, 8, 23, 25, 28, 39, 56, 102, 110, 141};
        System.out.println("Dime un número y comprobaré si está en el array: ");
        int num = Integer.parseInt(teclado.nextLine());
        int cont = 0;

        for (int i = 0; i < array.length; i++) {
            cont++;
            if (array[i] < num) {
                System.out.printf("%d == %d ? NO \n", array[i], num);
            }
            else if (array[i] == num) {
                System.out.printf("%d == %d ? SÍ \n", array[i], num);
                break;
            }
            if (array[i] > num) {
                System.out.printf("%d == %d ? NO \n", array[i], num);
                System.out.println("No encontrado entre los datos.");
                break;
            }
        }
        System.out.printf("Traza > Se han procesado %d elementos del array.", cont);
    }
}
