import java.util.Scanner;

public class Main01 {
    public static Scanner teclado = new Scanner(System.in);

    public static int lerInteiro(){
        int valor;
        System.out.println("Digite um valor");
        valor = teclado.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        // Variáveis
        int numero, numero_quadrado;

        // Entrada
        numero = lerInteiro();

        // Processamento
        numero_quadrado = numero * numero;

        //Saída
        System.out.println(numero_quadrado);
    }
}