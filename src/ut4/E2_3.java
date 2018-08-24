package ut4;

import java.util.Scanner;
/*
Implementar búsquedas sobre array no ordenado.
 */
public class E2_3 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] datos = {4, 35, -2, 45, 32, 16, -89, 3, 78, 16};
        //Pedir un número al usuario para ver si está o no almacenado en el array
        System.out.println("Dime un número:");
        int num = Integer.parseInt(teclado.nextLine());
        boolean sw = true;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == num) {
                System.out.printf("Encontrado en la posición %d.\n", i);
                sw = false;
            }
        }
        if (sw) {
            System.out.println("Valor no encontrado en el array");
        }

        //Cambiar los valores negativos por un 0 y mostrar cuántos
        int cont = 0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] < 0) {
                datos[i] = 0;
                cont++;
            }
        }

        System.out.printf("Se han cambiado %d valores negativos por un 0.\n", cont);

    }
}
