import java.util.Scanner;

public class W1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int maxNum = keyboard.nextInt();

        int cont = 1;
        while (cont <= maxNum) {
            if (cont % 2 == 0) {
                System.out.println(cont);
            }
            cont = cont + 1;
        }
    }
}
