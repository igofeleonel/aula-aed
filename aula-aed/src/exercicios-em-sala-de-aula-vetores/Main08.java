import java.util.Scanner;

public class Main08 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valores_inteiros;
        System.out.print(msg);
        valores_inteiros = entrada.nextInt();
        return valores_inteiros;
    }

    public static void main(String[] args) {
        int i;
        int n = 0;
        int k = 0;

        n = lerInteiro("");
        k = lerInteiro("");

        int[] vetor = new int[n];

        for (i = 0; i < n; i++) {
            vetor[i] = i % k;
        }

        System.out.print("[");

        for (i = 0; i < n; i++) {
            System.out.print(vetor[i]);

            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}