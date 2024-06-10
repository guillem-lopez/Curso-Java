import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word;
        char letter;
        int length, cont = 0, contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;

        System.out.print("Introduce una palabra y te cuento cada vocal: ");
        word = keyboard.nextLine();

        length = word.length();
        do {
            letter = word.charAt(cont);
            switch (letter) {
                case 'a':
                    contA++;
                    break;
                case 'e':
                    contE++;
                    break;
                case 'i':
                    contI++;
                    break;
                case 'o':
                    contO++;
                    break;
                case 'u':
                    contU++;
                    break;
                default: // para todos los casos que no sean los anteriores.
                    break;
            }
            cont++;
        } while (cont < length);
        System.out.println("La palabra tiene estas A: " +contA+ "; tiene estas E: " +contE+"; estas I: " +contI+ "; estas O: " +contO+ "; y estas U: " +contU);
    }
}
// String word = "hello"
//word.length() => 5
//word.charAt(0) => 'h'