import java.util.Scanner;

public class Ex02 {

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

        for (int qtde_asteriscos = 1; qtde_asteriscos <= n; qtde_asteriscos++) {
            for (int linhas = 1; linhas <= qtde_asteriscos; linhas++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}