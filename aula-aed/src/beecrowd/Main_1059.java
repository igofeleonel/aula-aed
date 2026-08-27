import java.util.Scanner;

public class Main_1059 {
    public static Scanner entrada = new Scanner(System.in);

    public static double lerEntrada(String mensagem) {
        double lerEntrada;
        System.out.println(mensagem);
        lerEntrada = entrada.next().charAt(0);
        return lerEntrada;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}