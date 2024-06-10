import java.util.Scanner;

public class Elevar {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = keyboard.nextInt();

        System.out.print("Introduce una potencia: ");
        int pot = keyboard.nextInt();

        int cont = 0;
        int product = 1;

        while (pot != cont){
            product = product * num;
            cont++;
        }

        System.out.println("El resultado es : " + product);



    }
}
