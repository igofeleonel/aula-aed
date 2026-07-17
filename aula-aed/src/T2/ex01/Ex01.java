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
        int n;

        n = InteiroPositivo("");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}