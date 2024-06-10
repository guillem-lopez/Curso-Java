import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Introduce un número del 1 al 10: ");
        int num = keyboard.nextInt();

        while (num < 1 || num > 10) {
            System.out.print("Tú eres tonto o q? Vuelve a introducir un núemero: ");
            num = keyboard.nextInt();
        }

        System.out.println("Tu número es: " + num);
    }
}
