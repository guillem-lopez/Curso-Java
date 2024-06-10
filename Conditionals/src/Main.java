import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Bienvenido a la aplicación Calculadora\n_____________________");

        System.out.print("Introduce un número: ");
        double num1 = keyboard.nextDouble();
        System.out.print("Introduce otro número: ");
        double num2 = keyboard.nextDouble();

        System.out.println("\nElige operación:\n1. Suma\n2. Resta\n3. Multiplicación");
        System.out.print("> ");
        int option = keyboard.nextInt();

        if (option == 1) {
            double sum = num1 + num2;
            System.out.println("La suma da: " + sum);
        } else {
            if (option == 2) {
                double reduce = num1 - num2;
                System.out.println("La resta da: " + reduce);
            } else {
                if (option == 3) {
                    double mult = num1 * num2;
                    System.out.println("La multiplicación da: " + mult);
                } else {
                    System.out.println("No hay opción");
                }
            }
        }
    }
}