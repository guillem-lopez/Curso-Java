import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Introduce un número, y te digo cuántas cifras tiene: ");
        int num = keyboard.nextInt();

        while (num < 0){
            System.out.print("Introduce un número positivo:");
            num = keyboard.nextInt();
        }

        if (num > 0){
            int cont = 0;
            while (num != 0){
                num = num / 10;
                cont++;

            }
            System.out.println("El número que has introducido tiene estos dígitos: " + cont);
        } else{
            System.out.println("El número es negativo");

        }

    }
}
