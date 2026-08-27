
import java.util.Arrays;
import java.util.Scanner;

public class Main06 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valor_inteiro;
        System.out.println(msg);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        int v[] = new int[20];
        Arrays.fill(v, 0);
        for (int valor : v) {
            System.out.print(valor + " ");
        }
    }
}