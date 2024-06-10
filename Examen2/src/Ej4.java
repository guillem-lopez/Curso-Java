//Programa un juego para 2 jugadores.
//El jugador 1 tendrá que introducir un número entre el 1 y el 20. Una vez introducido el jugador 2 tendrá 3 intentos
// para adivinar ese número.
//El programa tiene que ayudar al usuario, es decir. Si el jugador 1 ha introducido el número 12 y el jugador 2
// introduce el número 3, el programa le tendrá que decir "el número a adivinar es más alto". Si ahora introduce el
// número 15 tendrá que decir "el número es más bajo". Y si adivina el número tendrá que terminar el programa diciendo que ha adivinado el número.
//Recordemos que el número a adivinar está entre el 1 y el 20.
//En caso de que no lo haya acertado en los 3 intentos tendrá que salir del programa diciendo que ha perdido
// y que el número a adivinar era el número, en este caso, 12

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, cont = 0;

        do {
            System.out.print("[Jugador 1] Introduce un número entre el 1 y el 20: ");
            num1 = keyboard.nextInt();
            if (num1 < 1 || num1 > 20) {
                System.out.println("Recuerda que tienes que introducir un número entre el 1 y el 20\n");
            }
        } while (num1 < 1 || num1 > 20);

        do {
            do {
                System.out.print("[Jugador 2] Adivina el número introducido (1-20): ");
                num2 = keyboard.nextInt();
                if (num2 < 1 || num2 > 20) {
                    System.out.println("Recuerda que tienes que introducir un número entre el 1 y el 20\n");
                }
            } while (num2 < 1 || num2 > 20);

            if (num1 == num2) {
                System.out.println("¡Enhorabuena, has acertado!");
            } else if (num1 < num2) {
                System.out.println("El número que has introducido es mayor");
            } else {
                System.out.println("El número que has introducido es menor");
            }

            cont++;
            if (cont == 3) {
                System.out.println("Pero has perdido. El número era: " + num1);
            }
        } while (cont < 3 && num1 != num2);
    }
}
