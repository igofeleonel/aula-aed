import java.util.Scanner;

public class Main {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor;
        System.out.print(mensagem);
        valor = entrada.nextInt();
        return valor;
    }

    public static void main(String args[]) {
        int[] idades;
        int i;
        int tamanho;

        // Entrada do tamanho
        tamanho = lerInteiro("Quantos valores deseja armazenar? ");

        // Alocação de vetores
        idades = new int[8];

        // System.out.println(idades.lenght);
        // Pergunta ao usuário os valores
        // que serão quadrados
        for (i = 0; i < idades.length; i++) {
            idades[i] = lerInteiro("Digite o valor: ");
        }

        System.out.println("=============================================");

        for (i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}