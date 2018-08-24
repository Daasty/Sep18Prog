package ut4;

import java.util.Scanner;

/*
Prog que pida al usuario un número a ver si está en un array cargado por código. Debe mostrar la primera posición
en la que se encuentra. La primera versión tiene valores desordenados y en la segunda ordenados. Con traza.
 */

public class E2_2_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] array = {23, 54, 2, 76, 8, 323, 5, 3, 89};
        System.out.println("Dime un número y comprobaré si está en el array: ");
        int num = Integer.parseInt(teclado.nextLine());
        int cont = 0;

        for (int i = 0; i < array.length; i++) {
            cont++;
            if (num == array[i]) {
                System.out.printf("%d == %d ? SÍ\n", array[i], num);
                System.out.printf("Encontrado en la posición %d. \n", i);
                break;
            }
            System.out.printf("%d == %d ? NO \n", array[i], num);
        }
        System.out.printf("Traza > Se han procesado %d elementos del array.", cont);
    }
}
