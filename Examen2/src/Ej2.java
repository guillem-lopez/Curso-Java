// Escribe un programa que pida al usuario ingresar números enteros positivos y los sume. El bucle debe terminar cuando
// el usuario ingrese un número negativo. Al final, el programa debe imprimir la suma total de los números ingresados.

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num, cont = 0;

        do {
            System.out.print("Introduce números positivos, y te los sumo. En el momento en que introduzcas uno negativo, detendré la suma: ");
            num = keyboard.nextInt();
            if (num > 0) {
                cont = cont + num;
            }
        } while (num > 0);
        System.out.println("La suma de los números positivos es: " + cont);
    }
}
