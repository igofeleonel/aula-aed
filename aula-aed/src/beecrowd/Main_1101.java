import java.util.Scanner;

public class Main_1101 {

    public static Scanner entrada = new Scanner(System.in);

    public static int ValorInteiro(String mensagem) {
        int ValorInteiro;
        System.out.println(mensagem);
        ValorInteiro = entrada.nextInt();
        return ValorInteiro;
    }

    public static void main(String[] args) {
        int M, N, soma;

        while (((M = entrada.nextInt()) > 0) && ((N = entrada.nextInt()) > 0)) {

            soma = 0;

            if (M > N) {

                for (int i = N; i <= M; i++) {
                    System.out.print(i + " ");
                    soma += i;
                }

                System.out.println("Sum=" + soma);

            } else {

                for (int i = M; i <= N; i++) {
                    System.out.print(i + " ");
                    soma += i;
                }

                System.out.println("Sum=" + soma);
            }
        }

        entrada.close();
    }
}