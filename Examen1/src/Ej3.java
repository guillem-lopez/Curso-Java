//Escribe un programa en Java que utilice un bucle DO-WHILE para pedir al usuario que introduzca un número positivo.
// Si el usuario introduce un número negativo o cero,
// el programa debe seguir solicitando un número positivo hasta que el usuario introduzca uno.

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;

        do {
            System.out.print("Introduce un número a partir del 1: ");
            num = keyboard.nextInt();
            if (num <= 0) {
                System.out.println("Mal");
            }
        } while (num <= 0);
        System.out.println("Tu número " + num + " es positivo");
    }
}



