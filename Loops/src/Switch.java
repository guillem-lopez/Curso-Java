import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Introduce tu nota: ");
        int mark = keyboard.nextInt();

        // IF
        if (mark >= 0 && mark <= 10) {
            if (mark < 5) {
                System.out.println("Tu nota " + mark + " es un INSUFICIENTE");
            } else if (mark == 5) {
                System.out.println("Tu nota " + mark + " es un SUFICIENTE");
            } else if (mark == 6) {
                System.out.println("Tu nota " + mark + " es un BIEN");
            } else if (mark >= 7 && mark <= 8) {
                System.out.println("Tu nota " + mark + " es un NOTABLE");
            } else {
                System.out.println("Tu nota " + mark + " es un SOBRESALIENTE mákina");
            }
        } else {
            System.out.println("Tu nota " + mark + " NO es válida");
        }

        // SWITCH
        if (mark >= 0 && mark <= 10) {
            switch (mark) {
                case 10:
                case 9:
                    System.out.println("SOBRESALIENTE");
                    break;
                case 8:
                case 7:
                    System.out.println("NOTABLE");
                    break;
                case 6:
                    System.out.println("BIEN");
                    break;
                case 5:
                    System.out.println("SUFICIENTE");
                    break;
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    System.out.println("INSUFICIENTE");
                    break;
            }
        } else {
            System.out.println("Tu nota " + mark + " NO es válida");
        }
    }
}
