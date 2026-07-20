import java.util.Scanner;

public class Ex04 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int lerInteiro;
        System.out.print(mensagem);
        lerInteiro = entrada.nextInt();
        return lerInteiro;
    }

    public static void main(String[] args) {
        int multiplicando = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println(" ");
            for (multiplicando = 1; multiplicando <= 10; multiplicando++) {
                int resultado_do_valor = i * multiplicando;
                System.out.println(i + " x " + multiplicando + " = " + resultado_do_valor);
            }
        }
    }
}