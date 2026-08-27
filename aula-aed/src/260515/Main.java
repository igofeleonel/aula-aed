import java.util.Scanner;

public class Main {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextInt();
    }

    public static void main(String[] args) {

        // Variáveis
        System.out.println("Escolhe o caractere para desenhar (1: *, 2");
        int opcao = entrada.nextInt();
        System.out.println("Quantas vezes deseja repetir?");
        int vezes = entrada.nextInt();

        String caractere = "";
        // Processamento

        switch (opcao) {
            case 1:
                caractere = "*";
                break;
            case 2:
                caractere = "-";
                break;
            default:
                caractere = "?";
                System.out.println("Opção inválida, usando padrão");
                break;
        }

        for (int i = 0; i < vezes; i++) {
            System.out.println(caractere);
        }

        // Saída

        entrada.close();
    }
}