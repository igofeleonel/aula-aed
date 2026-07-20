import java.util.Scanner;

public class Ex05 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;
        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        int n;

        n = lerInteiro("");

        for (int linhas_numero = 1; linhas_numero <= n; linhas_numero++) {
            for (int linhas_coluna = 1; linhas_coluna <= linhas_numero; linhas_coluna++) {
                System.out.print(linhas_coluna + " ");
            }
            System.out.println();
        }
    }
}