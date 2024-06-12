import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner eb = new Scanner(System.in);
        String word;

        System.out.print("Introduce a word: ");
        word = eb.nextLine();
        word = word.toLowerCase();

        System.out.println("The letters are:");
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
}

