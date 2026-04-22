import java.util.Scanner;

public class Main16 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valorInteiro;
        System.out.print(mensagem);
        valorInteiro = entrada.nextInt();
        return valorInteiro;
    }

    public static char lerCaractere(String mensagem) {
        char caractere;
        System.out.print(mensagem);
        caractere = entrada.next().charAt(0);
        return caractere;
    }

    public static void main(String[] args) {
        // Variáveis
        int valor1, valor2;
        char operador;

        valor1 = lerInteiro("Valor 1: ");
        valor2 = lerInteiro("Valor 2: ");
        operador = lerCaractere("Operador (+, -, *, /): ");

        // Processamento e saída
        if (operador == '+') {
            System.out.printf("%d + %d = %d\n", valor1, valor2, valor1 + valor2);
        } 
        else if (operador == '-') {
            System.out.printf("%d - %d = %d\n", valor1, valor2, valor1 - valor2);
        } 
        else if (operador == '*') {
            System.out.printf("%d * %d = %d\n", valor1, valor2, valor1 * valor2);
        } 
        else if (operador == '/') {
            if (valor2 != 0) {
                System.out.printf("%d / %d = %d\n", valor1, valor2, valor1 / valor2);
            } else {
                System.out.println("Erro: divisão por zero!");
            }
        } 
        else {
            System.out.println("Operador inválido!");
        }
    }
}