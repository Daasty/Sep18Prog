package ut2;

import java.util.Scanner;

/*
Preguntar al usuario la edad de un bebé en meses para saber qué puede hacer
Sonríen con 3
Se sientan con 6
Gatean con 9
Caminan con 12
*/
public class E3 {
    public static void main (String[] args) {
        System.out.println("Dime la edad del bebé y te diré qué puede hacer");
        Scanner teclado = new Scanner(System.in);
        int meses = teclado.nextInt();
        if (meses >= 3 && meses < 6) {
            System.out.println("Puede sonreír");;
        }
        else if (meses >= 6 && meses < 9){
            System.out.println("Puede sonreír y sentarse");
        }
        else if (meses >= 9 && meses < 12){
            System.out.println("Puede sonreír, sentarse y gatear");
        }
        else {
            System.out.println("Puede sonreír, sentarse, gatear y caminar");
        }
    }
}
