package ut3;

import java.util.Scanner;

/*
20 números para saber cuando se superó por primera vez el 400
 */
public class Modelo0 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean sw = true;
        int pos = 0;
        System.out.println("Escribe 20 números");
        for (int i = 1; i <= 20; i++) {
            int num = teclado.nextInt();
            if (num > 400 && sw == true) {
                pos = i;
                sw = false;
            }
        }
        if(sw == false){
            System.out.println("El número 400 se sobrepasó en la posición " + pos);
        }
        else {
            System.out.println("No encontrado");
        }

    }
}
