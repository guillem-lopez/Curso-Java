import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int price = 20;

        System.out.println("Cuántos años tienes?");
        int age = keyboard.nextInt();

        if (age >= 65) {
            double disc65 = (price * 50) / 100;
            System.out.println("Tu precio para mayor de 65 es: " + (price - disc65) + "€");
        } else {
            if (age < 18) {
                System.out.println("Son tus padres socios? (true/false)");
                boolean socio = keyboard.nextBoolean();

                if (socio == true) {
                    System.out.println("y cuál es tu nombre: ");
                    keyboard.nextLine();
                    String name = keyboard.nextLine();

                    double disc18s = (price * 35) / 100;
                    System.out.println(name + " tu precio para -18 y socios es: " + (price - disc18s) + "€");
                } else {
                    double disc18ns = (price * 25) / 100;
                    System.out.println("tu precio para -18 y NO socios es: " + (price - disc18ns) + "€");
                }
            } else {
                System.out.println("tu precio será: " + price + "€");
            }
        }
    }
}
