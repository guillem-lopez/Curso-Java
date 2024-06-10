// Utilizando la estructura SWITCH tendrás que crear un menú en el cual tendremos 3 opciones. 1) Saludar 2) Sumar 2 números 3) salir.
// Dependiendo de la opción seleccionada hará una funcionalidad u otra. Si el usuario introduce
// cualquier otro número tendŕa que decir que la opción no es correcta y volverá a pedir una opción

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, num3, numSuma;

        do {
            System.out.print("1- Saludar\n2- Sumar dos números\n3- Salir\nEscoge una opción introduciendo un número: ");
            num1 = keyboard.nextInt();
            switch (num1) {
                case 1:
                    System.out.println("Hola, caraculo");
                    break;
                case 2:
                    System.out.print("Introduce un número: ");
                    num2 = keyboard.nextInt();
                    System.out.print("Introduce otro número: ");
                    num3 = keyboard.nextInt();
                    numSuma = num2 + num3;
                    System.out.println("La suma es: " + numSuma);
                    break;
                case 3:
                    System.out.print("Salir");
                    break;
                default:
                    System.out.print("Tu número no es ni 1 ni 2 ni 3");
                    break;
            }
        } while (num1 < 1 || num1 > 3);
    }
}
