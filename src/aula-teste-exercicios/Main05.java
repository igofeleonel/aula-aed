import java.util.Scanner;

public class Main05 {

    public static Scanner entrada = new Scanner(System.in);

    // Método para ler um número inteiro
    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static void main(String[] args) {
        // Variáveis
        int idade;
        int ano_nascimento;

        idade = lerInteiro("Digite sua idade: ");
        ano_nascimento = lerInteiro("Digite seu ano de nascimento: ");

        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu ano de nascimento é: " + ano_nascimento);

        entrada.close();
    }
}