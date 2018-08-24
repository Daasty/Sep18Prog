package ut3;

import java.util.Scanner;
/*
Pedir una cadena para repetirla 30 veces
 */
public class E5 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una cadena y la repetiré 30 veces");
        String frase = teclado.nextLine();
        for (int i = 1; i <= 30; i++) {
            System.out.println(i + "> " + frase);
        }
    }
}
