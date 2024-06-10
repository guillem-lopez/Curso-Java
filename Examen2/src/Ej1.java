// Escribe un programa que use un bucle while para contar del 10 al 1. Si el número es impar, el programa debe imprimir "impar" al lado del número.
//(Ex:
//1 - impar
//3 - impar
//5 - impar...)

public class Ej1 {
    public static void main(String[] args) {
        int cont = 10;

        while (cont >= 1) {
            if (cont % 2 != 0) {
                System.out.println(cont + "-impar");
            }
            cont--;
        }
    }
}
