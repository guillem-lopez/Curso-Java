// Pregunta 1:
//Escribe un programa en Java que solicite al usuario un número entero
// y determine si el número es par o impar. Usa un condicional IF para realizar la comprobación.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;

        System.out.print("Escribe un número: ");
        num = keyboard.nextInt();

        if (num % 2 == 0){
            System.out.println("Enhorabuena, tu hijo es par");
        } else{
            System.out.println("Enhorabuena, tu hija es impar");
        }
    }
}