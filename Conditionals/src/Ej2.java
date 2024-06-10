import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        int num3 = keyboard.nextInt();

        // sacar el número mayor
        if (num1 >= num2 && num1 >= num3) {
            System.out.print(num1 + " es el mayor");
        } else {
            if (num2 >= num1 && num2 >= num3) {
                System.out.print(num2 + " es el mayor");
            } else {
                System.out.print(num3 + " es el mayor");
            }
        }

        // sacar el número menor
        if (num1 <= num2 && num1 <= num3) {
            System.out.println(" y " + num1 + " es el menor");
        } else {
            if (num2 <= num1 && num2 <= num3) {
                System.out.println(" y " + num2 + " es el menor");
            } else {
                System.out.println(" y " + num3 + " es el menor");
            }
        }
    }
}
