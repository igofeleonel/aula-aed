import java.util.Scanner;

public class Ex07 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;
        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        int inicio, fim;
        int eprimo;

        inicio = lerInteiro("");
        fim = lerInteiro("");

        for (int i = inicio; i <= fim; i++) {
            eprimo = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    eprimo++;
                }
            }

            if (eprimo == 2) {
                System.out.println(i);
            }

            eprimo = 0;
        }
    }
}