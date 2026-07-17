import java.util.Scanner;

public class Ex08 {

    public static Scanner entrada = new Scanner(System.in);

    public static int InteiroPositivo(String mensagem) {
        int InteiroPositivo;
        System.out.print(mensagem);
        InteiroPositivo = entrada.nextInt();
        return InteiroPositivo;
    }

    public static void main(String[] args) {
        int n;

        n = InteiroPositivo("");

        for (int i = 1; i <= n; i++) {
            for (int ImprimirMatriz = 1; ImprimirMatriz <= n; ImprimirMatriz++) {
                obterBordaMatrizQuadrada(i, ImprimirMatriz, n);
            }
            System.out.println();
        }
    }

    public static int obterBordasImprimir(int i, int j, int n) {
        int menor = Math.min(i, j);
        menor = Math.min(menor, n - i + 1);
        menor = Math.min(menor, n - j + 1);

        return menor;
    }

    public static void obterBordaMatrizQuadrada(int i, int j, int n) {
        int menor = obterBordasImprimir(i, j, n);
        System.out.print(menor + " ");
    }
}