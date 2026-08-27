import java.util.Scanner;

public class Ex06 {

    public static Scanner entrada = new Scanner(System.in);

    public static int InteiroPositivo(String mensagem) {
        int inteiroPositivo;
        System.out.print(mensagem);
        inteiroPositivo = entrada.nextInt();
        return inteiroPositivo;
    }

    public static void main(String[] args) {
        int n = 5;

        n = InteiroPositivo("");

        for (int linhas = 1; linhas <= n; linhas++) {
            for (int posicaoColuna = 1; posicaoColuna <= n; posicaoColuna++) {
                if (linhas == 1 || linhas == n || posicaoColuna == 1 || posicaoColuna == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}