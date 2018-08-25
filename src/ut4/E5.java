package ut4;

/*
 * Crear dos arrays con datos desde código y hacer:
 * Una lista que diga los valores del segundo array que estén en el primero
 * Una lista que muestre valores del segundo array que no estén en el primero NPI
 */
public class E5 {
    public static void main(String[] args) {
        int[] array1 = {2, 24, 3, 7, 18, 0, 14, 16, 21, 25};
        int[] array2 = {3, 6, 5, 28, 14, 19, 23, 7, 9, 2};
        boolean sw = true;

        System.out.println("Valores del array 1 que están en el segundo array: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.printf("Posiciónes array1 -> %d; array2 -> %d || Valor -> %d \n", i, j, array2[j]);
                    sw = false;
                }
            }
        }
        if (sw) {
            System.out.println("No hay coincidencias.");
        }

        System.out.println();
        System.out.println();

        //Valores del segundo array que no están en el primero
        boolean sw1 = false;

        for (int i = 0; i < array2.length; i++) {
            sw1 = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    sw1 = true;
                }
            }
            if (!sw1) {
                System.out.printf("No existe el valor en array2 -> %d || Valor -> %d \n", i, array2[i]);
            }
        }
    }
}
