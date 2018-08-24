package ut3.buclesAnidados;
/*
Programa que muestra las tablas de multiplicar
 */
public class E1 {
    public static void main(String[] args) {
        System.out.println("Tablas de multiplicar: ");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("(%d x %d) = %d ||", i, j,  i * j);
            }
            System.out.println();
        }
    }
}
