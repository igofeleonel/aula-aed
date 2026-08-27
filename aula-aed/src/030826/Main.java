import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valor_inteiro;
        System.out.println(msg);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        int x = 3;
        System.out.println("Valor de X: " + x);
        x = 4;
        System.out.println("Valor de X de novo: " + x);
    }
}