import java.util.Scanner;

public class Ex03 {

    public static Scanner entrada = new Scanner(System.in);

    public static int InteiroPositivo(String mensagem) {
        int valor_inteiro;
        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        int n = 0;

        n = InteiroPositivo("");

        for (int linhas = n; linhas >= 1; linhas--) {
            for (int qtde_asteriscos = 1; qtde_asteriscos <= linhas; qtde_asteriscos++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}