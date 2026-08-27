import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valores_inteiro;
        System.out.print(msg);
        valores_inteiro = entrada.nextInt();
        return valores_inteiro;
    }

    public static void main(String[] args) {
        int[] resultado;
        // resultado = alocarValor();
    }

    public static int[] alocarVetor() {
        int[] v;
        v = new int[10];

        for (int i = 0; i < v.length; i++) {
            v[i] = 1;
        }

        return alocarVetor();
    }

}
