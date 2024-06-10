import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("El precio de la zapatilla es:");
        double price = keyboard.nextInt();
        System.out.println("El descuento es de:");
        int percent = keyboard.nextInt();

        double discount = (price * percent) / 100;
        double finalPrice = price - discount;

        System.out.println("El precio final es de: " + finalPrice + "€");
    }
}
