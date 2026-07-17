import java.util.Scanner;

public class Main01 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextInt();
    }

    public static void main(String[] args) {
        // Variáveis
        int i, j, k = 0, n_j = 1;

        int n = lerInteiro("Digite o número de linhas: ");

        int n_i = n - 1;

        while (k < n) {
            for (i = 0; i < n_i; i++) {
                System.out.print("-");
            }
            for (j = 0; j < n_j; j++) {
                System.out.print("*");
            }
            for (i = 0; i < n_i; i++) {
                System.out.print("-");
            }
            System.out.println();

            k++;
            n_i--;
            n_j += 2;
        }

        entrada.close();
    }
}