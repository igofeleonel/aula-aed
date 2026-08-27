import java.util.Scanner;

public class Main01 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;
        System.out.println(mensagem);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        // System.out.println(idade[0]);
        // System.out.println(idade[1]);
        // System.out.println(idade[7]);
        // System.out.println(idade[9]);

        // idade[2] = 14;
        // System.out.println(idade[2]);
    }
}