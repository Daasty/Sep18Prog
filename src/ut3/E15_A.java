package ut3;

import java.util.Scanner;
/*
Pedir las horas trabajadas, hasta 40 horas son 25e la hora, después 35 la hora.
 */
public class E15_A {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime las horas trabajadas");
        int horas = Integer.parseInt(teclado.nextLine());
        int horasTotales = 0;
        if (horas > 40) {
            horasTotales = (horas - 40) * 35 + 40 * 25;
        }
        else horasTotales = horas * 25;
        System.out.printf("El sueldo semanal es de %d por trabajar %d horas", horasTotales, horas);
    }
}
