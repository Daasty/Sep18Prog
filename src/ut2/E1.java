package ut2;
import java.util.Scanner;
public class E1 {
    public static void main (String[] args) {
        System.out.println("Dime un número en metros y te lo transformo a millas marinas");
        Scanner teclado = new Scanner(System.in);
        double metros = teclado.nextDouble();
        double millas = metros * 0.000539957;
        System.out.println(metros + " kilómetros son " + millas + " millas marinas");
    }
}
