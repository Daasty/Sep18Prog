package ut3;

import java.util.Scanner;
/*
Pedir las horas trabajadas, hasta 40 horas son 25e la hora, después 35 la hora.
Modificación del anterior en el que hay que incluir un bonus de 140e por menos de 20000 anuales, entre 20k y 50k 350e y 600 por más de 50k
 */
public class E15_B {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime las horas trabajadas: ");
        int horas = Integer.parseInt(teclado.nextLine());
        System.out.println("Dime cuánto has facturado: ");
        int facturado = Integer.parseInt(teclado.nextLine());
        int horasTotales = 0;
        int incentivo = 0;

        if (horas > 40) {
            horasTotales = (horas - 40) * 35 + 40 * 25;
        }
        else horasTotales = horas * 25;

        if (facturado < 20000) {
            incentivo = 140;
        }
        else if (facturado <= 50000) {
            incentivo = 350;
        }
        else incentivo = 600;
        System.out.printf("El sueldo semanal es de %d por trabajar %d horas, con un incentivo de %d euros", horasTotales, horas, incentivo);
    }
}
