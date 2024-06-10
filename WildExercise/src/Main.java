import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Introduce un número y te saco el factorial: ");
        int num = keyboard.nextInt();
        System.out.println(num);

        int cont = 0;
        int fact = 1;

        if (num > 0) {
            while (num != cont) {
                cont++; // cont++ es como decir cont +1
                fact = fact * cont;
            }

            System.out.println("El factorial del número " + num + " es: " + fact);

        } else {
            System.out.println("El número es negativo, no se puede");
        }



    }
}