import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        System.out.print(msg);
        return entrada.nextInt();
    }
    
    public static void main(String[] args) {
        int n = lerInteiro("Digite um número (0 para encerrar): ");
        int soma = 0;
        int count = 0;
        int maior = n;

        while (n != 0) {
            soma += n;
            count += 1;
            if (n > maior) {
                maior = n;
            }
            n = lerInteiro("Digite um número (0 para encerrar):");
        }

        if (count > 0) {
            System.out.println("Quantidade: " + count);
            System.out.println("Soma:   " + soma);
            System.out.printf("Média:     %.2f%n", (double) soma / count);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }
    }
}