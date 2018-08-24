package ut4;
/*
1. Mostrar los elementos del vector en pantalla
2. Mostrar los elementos del vector a la inversa
3. Mostrar los elementos del vector que ocupen posición par incluido el 0
4. Mostrar sólo la primera mitad del sector
 */
public class E1 {
    public static void main(String[] args) {
        int[] datos = {50, 200, 34, 21, 45, 339, 83};

        //Mostrar los elementos en pantalla
        for (int i = 0; i < datos.length; i++) {
            System.out.printf("%d ", datos[i]);
        }
        System.out.println();

        //Mostrar los elementos a la inversa
        System.out.println("Datos a la inversa:");
        for (int i = datos.length-1; i >= 0; i--) {
            System.out.printf("%d ", datos[i]);
        }
        System.out.println();

        //Mostrar los elementos en posición par incluido el 0
        System.out.println("Elementos en posiciones pares:");
        for (int i = 0; i < datos.length; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d ", datos[i]);
            }
        }
        System.out.println();

        //Mostrar sólo la mitad del array
        System.out.println("Sólo la mitad del Array: ");
        for (int i = 0; i < datos.length/2; i++) {
            System.out.printf("%d ", datos[i]);
        }
    }
}
