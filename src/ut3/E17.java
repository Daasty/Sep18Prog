package ut3;

import java.util.Scanner;

/*
Preguntar a un viajero los minutos de las paradas que hace para mostrar al final hh:mm
 */
/*
int hours = t / 60; //since both are ints, you get an int
int minutes = t % 60;
System.out.printf("%d:%02d", hours, minutes);
 */
public class E17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime los minutos de cada parada");
        //Declaraciones
        char resp = ' ';
        int cont = 1;
        int min = 0;
        int totalMin = 0;

        //Bucle que pide minutos y los acumula preguntando si desea continuar
        do {
            System.out.printf("Minutos de la %da parada: ", cont++);
            min = Integer.parseInt(teclado.nextLine());
            System.out.println("Deseas continuar?(s/n)");
            resp = teclado.nextLine().toLowerCase().charAt(0);
            totalMin += min;
        } while (resp == 's');

        //Divide entre 60 para calcular las horas y el resto para los minutos
        int hours = totalMin / 60;
        int minutes = totalMin % 60;
        System.out.printf("El viaje ha durado %d:%02d en total", hours, minutes);
    }
}
