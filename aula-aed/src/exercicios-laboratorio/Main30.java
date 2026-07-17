import java.util.Scanner;

public class Main30 {

    public static Scanner entrada = new Scanner(System.in);

    public static boolean ehPerfeito(int n) {

        if (n <= 1) {
            return false;
        }

        int soma = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                soma++;
            }
        }

        return soma == n;
    }

    public static void main(String[] args) {
        System.out.println("Digite um número inteiro e positivo: ");
        int n = entrada.nextInt();

        if (ehPerfeito(n)) {
            System.out.println("Verdadeiro");
            System.out.println("Falso");
        } else {
            System.out.println("Falso");
            System.out.println(n + " não é perfeito");
        }

        entrada.close();
    }
}