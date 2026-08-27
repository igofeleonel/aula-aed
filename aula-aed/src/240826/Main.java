import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;
        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static void main(String[] args) {
        // variáveis
        int idade;
        int ano_nasicmento;

        // entrada
        idade = lerInteiro("Digite sua idade: ");
        ano_nasicmento = lerInteiro("Digite o ano de nascimento: ");

        // saída
        System.out.println("Idade: " + idade);
        System.out.println("Ano de nascimento: " + ano_nasicmento);
    }
}