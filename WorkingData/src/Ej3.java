import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("La base es de: ");
        double base = keyboard.nextDouble();
        System.out.print("La altura es de: ");
        double height = keyboard.nextDouble();

        double perimetro = (base * 2) + (height * 2);
        double area = base * height;

        String introductionText = base + " y " + height + " es => ";

        System.out.println("\nel perímetro de " + introductionText + perimetro + "m");
        System.out.println("el área de " + introductionText + area + "m^2");
    }
}
