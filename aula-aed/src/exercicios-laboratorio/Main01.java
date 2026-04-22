import java.util.Scanner;
public class Main01 {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;
        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }
    
    public static void main(String[] args) {
        int valor;

        valor = lerInteiro("Digite um número: ");

        if (valor % 2 == 0) {
            System.out.println("O valor é par");
        } else {
            System.out.println("O valor é impar");
        }
    }
}
