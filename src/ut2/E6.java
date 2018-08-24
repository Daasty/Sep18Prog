package ut2;

import java.util.Scanner;

/*
Dime cuánto te has gastado y te diré el descuento
 */
public class E6 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime cuánto te has gastado:");
        int gastado = teclado.nextInt();
        System.out.println("En qué día estamos?");
        String dia = teclado.next();
        double precioTotal;
        int descuento = gastado / 200 * 6;
        if(gastado >= 400 && gastado <= 1000) {
            precioTotal = gastado * 0.92;
        }
        else {
            precioTotal = gastado * 0.80;
        }

        if (dia.equals("Martes")) {
            precioTotal = precioTotal * 0.95;
        }
        precioTotal = (double) Math.round(precioTotal * 10d) / 10d;
        System.out.println("El precio total es de " + precioTotal + " y tienes " + descuento + "e de descuento para la próxima compra.");
    }
}
