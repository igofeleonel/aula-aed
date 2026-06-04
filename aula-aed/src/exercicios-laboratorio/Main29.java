import java.util.Scanner;

public class Main29 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiroNaoNegativo(String mensagem) {
        int valor_inteiro;
        do {
            System.out.print(mensagem);
            valor_inteiro = entrada.nextInt();
        } while (valor_inteiro < 0);

        return valor_inteiro;
    }

    public static void main(String[] args) {
        // Parte 1: Loop de "Boa noite"
        int i;
        i = 5;
        do {
            System.out.println("Boa noite: " + i);
            i++;
        } while (i < 10);

        System.out.println(); // Apenas para pular uma linha

        // Parte 2: Verificação de divisores
        int n;
        n = lerInteiroNaoNegativo("Digite um valor para n: ");

        System.out.println("Divisores de " + n + ":");
        for (int j = 1; j <= n; j++) {
            if (n % j == 0) {
                System.out.println(j);
            }
        }
    }
}