import java.util.Scanner;

public class Main01 {

    public static Scanner entrada = new Scanner(System.in);

    public static double lerReal(String mensagem) {
        double valor_real;
        System.out.print(mensagem);
        valor_real = entrada.nextDouble();
        return valor_real;
    }

    public static void main(String[] args) {
        // variáveis e entrada
        double altura = lerReal("Digite sua altura (m): ");
        double peso = lerReal("Digite seu peso (kg): ");

        // saída
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");
    }
}
