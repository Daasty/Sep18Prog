package ut3.buclesAnidados;

import java.util.Scanner;
/*
Pide una cadena al usuario para mostrarla tantas veces hasta que el usuario no quiera verla más
 */
public class E3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una cadena y la repetiré hasta que no quieras: ");
        String cadena =  teclado.nextLine();
        System.out.println("Dime cuantas veces quieres que lo repita:");
        int num = Integer.parseInt(teclado.nextLine());
        char resp = 's';

        for (int i = 1; i <= num; i++) {
            System.out.println(cadena);
            if (i == num){
                System.out.println("Quieres continuar? (s/n)");
                resp = teclado.nextLine().toLowerCase().charAt(0);
                if (resp == 's') {
                    i = 0;
                }
            }
        }
    }
}
