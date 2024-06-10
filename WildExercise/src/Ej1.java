import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Introduce un número y te enumero hasta el cero: ");
        int num = keyboard.nextInt();

        if (num > 0){
            int cont = num;
            while (cont >= 0){
                System.out.println(cont);
                cont--;
            }
        }



    }
}
