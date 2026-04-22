import java.util.Scanner;

public class Main03 {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;
        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        int valor_1, valor_2, valor_3;
        int menor, maior;

        valor_1 = lerInteiro("Valor 1: ");
        menor = valor_1;
        maior = valor_1;

        valor_2 = lerInteiro("Valor 2: ");
        if (valor_2 < menor) {
            menor = valor_2;
        }
        if (valor_2 > maior) {
            maior = valor_2;
        }

        valor_3 = lerInteiro("Valor 3: ");
        if (valor_3 < menor) {
            menor = valor_3;
        }
        if (valor_3 > maior) {
            maior = valor_3;
        }

        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
    }
}