import java.util.Scanner;

public class Main02 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valor_inteiro;
        System.out.println(msg);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        int n[] = { 3, 2, 8, 7, 5, 4 };
        for (int c = 0; c <= n.length - 1; c++) {
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
    }
}