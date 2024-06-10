//Pregunta 4:
//Escribe un programa en Java que lea un número del 1 al 7 y muestre el día de la semana correspondiente.
// Usa una estructura switch para realizar esta operación. Si el usuario introduce un número que no esté en ese
// rango seguirá preguntando un número hasta que el usuario introduzca una opción válida
//
//Notas:
//Cada programa debe compilar y ejecutarse correctamente.
//La entrada y salida deben ser claras y fáciles de entender para el usuario.

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;

        do {
            System.out.print("Introduce un número del 1 al 7, y te digo qué día de la semana es: ");
            num = keyboard.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Es lunes");
                    break;
                case 2:
                    System.out.println("Es martes");
                    break;
                case 3:
                    System.out.println("Es miércoles");
                    break;
                case 4:
                    System.out.println("Es jueves");
                    break;
                case 5:
                    System.out.println("Es viernes");
                    break;
                case 6:
                    System.out.println("Es sábado");
                    break;
                case 7:
                    System.out.println("Es domingo");
                    break;
                default:
                    System.out.println("Mal, entre 1 y 7");
                    break;
            }
        } while (num < 1 || num > 7);
    }
}
