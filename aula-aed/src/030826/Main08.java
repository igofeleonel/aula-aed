import java.util.Arrays;
import java.util.Scanner;

public class Main08 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valor_inteiro;
        System.out.println(msg);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        // Armazenar vários do mesmo tipo
        // Tipo[] nomeVariavel = new tipo[5];

        int[] numeros = new int[100];

        // Preenche o Array com um valor

        Arrays.fill(numeros, 40);

        for (int posicao = 0; posicao < numeros.length; posicao++) {
            System.out.println(numeros[posicao]);
        }

        System.out.println(numeros.length);

        // System.out.println(numeros[50]);
    }
}