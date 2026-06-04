import java.util.Scanner;

public class Main23 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = 4;
        int fatoreal = 1;
        int i = numero;

        System.out.print(numero + "! = ");

        while (i > 0) {
            fatoreal *=     i;

            System.out.print(i + (i > 1 ? " * " : ""));

            i--;
        }
        System.out.println(" = " + fatoreal);
    }
}