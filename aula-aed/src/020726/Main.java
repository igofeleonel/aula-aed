import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int lerInteiro;
        System.out.println(mensagem);
        lerInteiro = entrada.nextInt();
        return  lerInteiro;
    }

    public static void main(String[] args) {
        int n = lerInteiro("Digite um número: ");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(j);

                if (j < i) {
                    System.out.print("");
                }
            }
            
            System.out.println();
        }
    }
}