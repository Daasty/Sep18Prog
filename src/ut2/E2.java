package ut2;
import java.util.Scanner;
/*
Pide al usuario el nivel de ventas de un producto para mostrar la valoración
 */
public class E2 {
    public static void main (String[]args) {
        System.out.println("Dime cuántas ventas ha tenido el producto");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        if (num <= 10000) {
            System.out.println("La valoración es: Regular");
        }
        else if (num <= 50000) {
            System.out.println("La valoración es: Normal");
        }
        else if (num <= 125000) {
            System.out.println("La valoración es: Bueno");
        }
        else {
            System.out.println("La valoración es: Excelente");
        }
    }
}
