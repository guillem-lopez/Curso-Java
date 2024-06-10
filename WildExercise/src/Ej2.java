import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numVueltas, num, cont = 0, contPos = 0, contNeg = 0, contNul = 0, resPos = 0, resNeg = 0;

        System.out.print("Introduce cúantos números quieres meter: ");
        numVueltas = keyboard.nextInt();

        while (cont < numVueltas) {
            System.out.print("Introduce un número: ");
            num = keyboard.nextInt();
            cont++;

            if (num > 0) {
                contPos++;
                resPos = resPos + num;
            } else if (num < 0) {
                contNeg++;
                resNeg = resNeg + num;
            } else {
                contNul++;
            }
        }

        System.out.println("\nHay " + contPos + " números positivos\nHay " + contNeg + " números negativos\nHay " + contNul + " números nulos");

        System.out.println("La suma de los números positivos es: " + resPos + "\nLa suma de los números negativos es: " + resNeg);



    }
}
