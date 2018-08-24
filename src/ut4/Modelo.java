package ut4;

import java.util.Scanner;
/*
1. Cargar las edades de los alumnos en un array
2. Cargarlos por teclado
3 .Mostrar los datos en pantalla
4. Mostrar la edad máxima, mínima y media
5. Mostrar el número de alumnos con edad inferior a 25 y los que tienen la misma o más
6. Mostrar la posición en el array de los que tienen 18 años, si no hay, hay que indicarlo
 */
public class Modelo {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Declaración del array
        int[] edades = {19, 33, 23, 18, 25, 31, 19, 24, 28, 40};

        //Lectura por teclado
        System.out.println("Dime las edades de los alumnos: ");
        for (int i = 0; i < edades.length; i++) {
            System.out.printf("Edad del alumno %d: ", i + 1);
            edades[i] = Integer.parseInt(teclado.nextLine());
        }

        //Mostrar en pantalla
        for (int i = 0; i < edades.length; i++) {
            System.out.printf("edades[%d] = %d\n", i + 1, edades[i]);
        }

        System.out.println();

        //Edad máxima, mínima y media

        int max = 0, min = 130, media = 0;
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] > max) {
                max = edades[i];
            }
            else if (edades[i] < min) {
                min = edades[i];
            }
            media += edades[i];
        }

        System.out.printf("La edad máxima es %d, la mínima %d y la media %d.\n", max, min, media/edades.length);

        //Mostrar alumnos con edad inferior a 25 y con 25 o más
        int emax = 0, emin = 0;
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] < 25) {
                emin++;
            }
            else if (edades[i] >= 25) {
                emax++;
            }
        }
        System.out.printf("Hay %d alumnos con menos de 25 y %d con 25 o más.\n", emin, emax);

        //Mostrar la posición en el array de los que tienen 18 años, si no hay, hay que indicarlo
        boolean sw = true;
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] == 18) {
                sw = false;
                System.out.printf("Alumno con 18 anos en la posición %d\n", i+1);
            }
        }
        if (sw) {
            System.out.println("No hay alumnos con 18 anos");
        }
    }
}
