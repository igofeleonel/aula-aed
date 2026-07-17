import java.util.Scanner;

public class Ex07 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int lerInteiro;
        System.out.println(mensagem);
        lerInteiro = entrada.nextInt();
        return lerInteiro;
    }

    public static void main(String[] args) {
        int i, j;
        int inicio, fim, ehPrimo = 0;

        inicio = entrada.nextInt();
        fim = entrada.nextInt();

        for (i = inicio; i <= fim; i++) {
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    ehPrimo++;
                }
            }
            if (ehPrimo == 2) {
                System.out.println(i);
            }
            ehPrimo = 0;
        }
    }
}