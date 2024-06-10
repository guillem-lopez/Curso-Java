import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Escoge un número entero: ");
        int num = keyboard.nextInt();

        if (num % 2 == 0) { // = par
            System.out.println("Tu número " + num + " es par");
        } else {
            System.out.println("Tu número " + num + " es impar");
        }
    }
}