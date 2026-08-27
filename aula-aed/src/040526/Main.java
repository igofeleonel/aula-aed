import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;
        System.out.println(mensagem);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        int[] idade = { 20, 22, 18, 40, 37, 20, 12, 65, 68, 40 };
        float[] altura = { 1.62f, 1.10f, 0.23f, 1.80f, 1.42f, 1.20f, 0.90f, 1.40f };
        boolean[] porta_aberta = { true, false, false, true };
    }
}
