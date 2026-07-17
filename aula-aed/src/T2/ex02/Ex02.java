import java.util.Scanner;

public class Ex02 {

    public static Scanner entrada = new Scanner(System.in);

    public static int InteirPositivo(String mensagem) {
        int valor_inteiro;
        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        int n;

        n = InteirPositivo("");

        for (int asteriscos = 1; asteriscos <= n; asteriscos++) {
            for (int linha = 1; linha <= asteriscos; linha++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
