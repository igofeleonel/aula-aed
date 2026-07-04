import java.util.Scanner;

public class Soma {
    
    public final static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        int num1;
        int num2;
        int res;

        // Entrada
        System.out.println("Digite o primeiro numero: ");
        num1 = tc.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = tc.nextInt();

        // Processamento
        res = num1 + num2;

        // Saida
        System.out.println("O resultado da soma é: " + res);

        
    }
}
