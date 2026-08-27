import java.util.Arrays;
import java.util.Scanner;

public class Main04 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valor_inteiro;
        System.out.println(msg);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        double v[] = { 3.5, 2.75, 9, -4.5 };
        Arrays.sort(v);
        for (double valor : v) {
            System.out.print(valor + " ");
        }
    }
}