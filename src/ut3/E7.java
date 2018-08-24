package ut3;

import java.util.Scanner;

/*
Tienda con descuentos. Por menos de 100e un 5%, entre 100 y 400 un 10% y para más de 400e un 25%
 */
public class E7 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime cuánto te has gastado y te diré el descuento:");
        int gastado = Integer.parseInt(teclado.nextLine());
        double descuento;
        if (gastado < 100) {
            descuento = 5;
        }
        else if (gastado >= 100 && gastado <= 400) {
            descuento = 10;
        }
        else descuento = 25;

        System.out.println("El precio total es de " + gastado * (1 - descuento / 100) + " con el descuento del " + descuento + "%");
    }
}
