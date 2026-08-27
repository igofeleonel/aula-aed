import java.util.Scanner;

public class Ex01 {

    public static Scanner entrada = new Scanner(System.in);

    public static int InteiroPositivo(String mensagem) {
        int valor_inteiro;
        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        int n = 5;

        n = InteiroPositivo("");

        for (int linha_asteriscos = 1; linha_asteriscos <= n; linha_asteriscos++) {
            for (int colunas_asteriscos = 1; colunas_asteriscos <= n; colunas_asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}