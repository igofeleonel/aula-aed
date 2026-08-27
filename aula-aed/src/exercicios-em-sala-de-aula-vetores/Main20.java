import java.util.Scanner;

public class Main20 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valores_inteiros;
        System.out.print(msg);
        valores_inteiros = entrada.nextInt();
        return valores_inteiros;
    }

    public static int[] copiarSubVetor(int[] v, int a, int b) {
        int[] sub_vetor;
        sub_vetor = new int[b - a];
        int idx = 0;

        for (int i = a; i < b; i++) {
            sub_vetor[idx] = v[i];
            idx++;
        }

        return sub_vetor;
    }

    public static void main(String[] args) {

        int[] v = { 10, 20, 30, 40, 50 };

        int[] sub_vetor = copiarSubVetor(v, 1, 4);

        for (int i = 0; i < sub_vetor.length; i++) {
            System.out.print(sub_vetor[i] + " ");
        }

    }

}