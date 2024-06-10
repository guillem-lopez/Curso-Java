import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String finalText = "Mi nota final es: ";
        System.out.print("Mi primera nota es: ");
        double mark1 = keyboard.nextDouble();
        System.out.print("Mi segunda nota es: ");
        double mark2 = keyboard.nextDouble();
        System.out.print("Mi tercera nota es: ");
        double mark3 = keyboard.nextDouble();
        System.out.println("\n____________\n");
        double finalMark = (mark1 + mark2 +mark3) / 3;
        System.out.println(finalText + finalMark);


    }
}