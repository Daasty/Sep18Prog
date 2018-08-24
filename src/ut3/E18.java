package ut3;
import java.util.Scanner;
/*
Pedir un número y mostrar los números naturales menores e igual que no sean múltiplos de 3 y de 7
 */
public class E18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número: ");
        int num = Integer.parseInt(teclado.nextLine());
        for (int i = 1; i <= num; i++){
        if (i % 3 != 0 && i % 7 != 0) {
                System.out.printf("%d, ", i);
            }
        }
    }
}
