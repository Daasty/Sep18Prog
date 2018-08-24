package ut4;
/*
Sobre un array:
1. Indicar cuantos son pares y cuantos impares
2. Mostrar la suma de los positivos y de los negativos
3. Sustituye los valores negativos del array por un 0 e indica el número de ellos sustutidos
4. Mostrar cuál es el mayor número y en qué posiciones está
 */
public class E2_1 {
    public static void main(String[] args) {
        int[] datos = {300, 24, 54, -21, 3, -42, 300, 134, -234};
        int par = 0, impar =0;

        //Indicar cuáles son pares y cuáles impares
        System.out.println("Pares e impares: ");
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] % 2 == 0) {
                par++;
            }
            else impar++;
        }
        System.out.printf("Hay %d pares y %d impares \n", par, impar);

        //Mostrar la suma de los pos y de los neg
        System.out.println("Suma positivos y negativos: ");
        int pos = 0, neg = 0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] > 0) {
                pos += datos[i];
            }
            else neg += datos[i];
        }
        System.out.printf("La suma de positivos es %d, la de negativos %d.\n", pos, neg);

        //Sustituir los valores del Array negativos por un 0 e indicar el número de ellos sustituidos
        int cont = 0;

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] < 0) {
                datos[i] = 0;
                cont++;
            }
        }
        System.out.printf("Se han sustituido %d números negativos.\n", cont);

        //Mostrar cuál es el mayor valor almacenado en el array y mostrar en qué posiciones está
        int num1 = 0;

        for (int i = 0; i<datos.length; i++) {
            if (datos[i] > num1) {
                num1 = datos[i];
            }
        }
        System.out.printf("El mayor es %d.\n", num1);
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == num1) {
                System.out.printf("El mayor está ubicado en la posición %d del array.\n", i);
            }
        }
    }
}