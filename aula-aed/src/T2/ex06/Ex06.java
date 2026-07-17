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
        int n = 0;

        n = InteiroPositivo("");

        for (int bordaAtual = 1; bordaAtual <= n; bordaAtual++) {
            for (int ultimaLinha = 1; ultimaLinha <= n; ultimaLinha++) {
                if (bordaAtual == 1 || bordaAtual == n
                        || ultimaLinha == 1 || ultimaLinha == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}