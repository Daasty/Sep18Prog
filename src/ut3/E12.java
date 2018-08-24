package ut3;

import java.util.Scanner;
/*
Pedir letras y almacenar A,E,I,O,U en un switch para mostrar cuántas se han escrito
 */
public class E12 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime letras y las acumularé");
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        char resp = 's';
        do {
            System.out.println("Dime una letra: ");
            char letra = teclado.nextLine().charAt(0);
            switch (letra) {
                case 'A': a++;
                    break;
                case 'E': e++;
                    break;
                case 'I': i++;
                    break;
                case 'O': o++;
                    break;
                case 'U': u++;
                    break;
            }

            System.out.println("Quiéres continuar? (s/n)");
            resp = teclado.nextLine().trim().toLowerCase().charAt(0);

        } while (resp == 's');


        System.out.printf("Se han escrito %d veces la letra A, %d la E, %d la I, %d la O, %d la U", a, e, i, o, u);
    }
}
