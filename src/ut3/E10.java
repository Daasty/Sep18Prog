package ut3;

import java.util.Scanner;
/*
Pedir edades hasta que no quiera continuar para mostrar: Edad max, min y media. Total con más de 30 años
 */
public class E10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime edades hasta que no quieras");
        char sw = ' ';
        int max = -1, min = 150, media = 0, cont = 0, contEdad = 0;
        do {
            int num = Integer.parseInt(teclado.nextLine());
            if (num > max) {
                max = num;
            }
            else if (num < min){
                min = num;
            }

            if (num >= 30){
                contEdad++;
            }
            media += num;
            cont++;
            System.out.println("Quiéres continuar? (s/n)");
            sw = teclado.nextLine().toLowerCase().trim().charAt(0);
        } while (sw == 's');

        media = media / cont;
        System.out.printf("La edad máxima es %d, la mínima %d, la media es %d. Con más de 30 son %d.", max, min, media, contEdad);

    }
}
