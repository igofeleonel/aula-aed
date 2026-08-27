import java.util.Scanner;

public class Main03 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;
        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        // Declaração variáveis
        int[] c;
        int i;

        // Aloca vetor
        c = new int[10];

        // Leitura de dados
        for (i = 0; i < c.length; i++) {
            c[i] = lerInteiro("Valor: ");
        }

        // Mostra o vetor com os valores originais
        System.out.print("[");

        for (i = 0; i < c.length; i++) {
            System.out.print(c[i]);

            if (i < c.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        // Atualizar os valores negativos para 0
        for (i = 0; i < c.length; i++) {
            if (c[i] < 0) {
                c[i] = 0;
            }
        }

        // Mostra o vetor com os valores atualizados
        // Mostre o vetor com os valores originais

        System.out.print("[");

        for (i = 0; i < c.length; i++) {
            System.out.print(c[i]);

            if (i < c.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}