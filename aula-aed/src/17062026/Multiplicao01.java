import java.util.Scanner;

public class Multiplicao01 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;
        int resultado;

        // Entrada
        System.out.println("Digite o numero");
        numero = entrada.nextInt();

        // Processamento
        resultado = numero * 2;
        
        // Saida
        System.out.println(resultado);
    }
}
