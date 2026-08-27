import java.util.Scanner;

public class Main10 {

    public static Scanner entrada = new Scanner(System.in);

    public static double lerInteiro(String msg) {
        double valores_inteiros;
        System.out.print(msg);
        valores_inteiros = entrada.nextInt();
        return valores_inteiros;
    }

    public static void main(String[] args) {
        int i;

        double[] vetor01 = new double[5];
        double[] vetor02 = new double[5];

        double produto = 0.0;

        for (i = 0; i < vetor01.length; i++) {
            vetor01[i] = entrada.nextDouble();
        }

        for (i = 0; i < vetor02.length; i++) {
            vetor02[i] = entrada.nextDouble();
        }

        for (i = 0; i < vetor01.length; i++) {
            produto += vetor01[i] * vetor02[i];
        }

        System.out.println(produto);

    }
}