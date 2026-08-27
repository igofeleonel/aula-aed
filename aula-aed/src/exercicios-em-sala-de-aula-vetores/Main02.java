import java.util.Scanner;

public class Main02 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valores_inteiros;
        System.out.print(msg);
        valores_inteiros = entrada.nextInt();
        return valores_inteiros;
    }

    public static void main(String[] args) {
        int i;
        int[] valorA, valorB, valorC;
        valorA = new int[10];
        valorB = new int[10];
        valorC = new int[10];

        for (i = 0; i < valorA.length; i++) {
            valorA[i] = lerInteiro("");
        }

        for (i = 0; i < valorB.length; i++) {
            valorB[i] = lerInteiro("");
        }

        for (i = 0; i < valorC.length; i++) {

            if (i % 2 == 0) {
                valorC[i] = valorA[i] + valorB[i];
            } else {
                valorC[i] = valorA[i] - valorB[i];
            }

        }

        System.out.print("va: [");

        for (i = 0; i < valorA.length; i++) {
            System.out.print(valorA[i]);
            if (i < valorA.length - 1) {
                System.out.printf(", ");
            }
        }

        System.out.println("]");
        System.out.print("vb: [");

        for (i = 0; i < valorB.length; i++) {
            System.out.print(valorB[i]);
            if (i < valorB.length - 1) {
                System.out.printf(", ");
            }
        }

        System.out.println("]");
        System.out.print("vc: [");

        for (i = 0; i < valorC.length; i++) {
            System.out.print(valorC[i]);
            if (i < valorC.length - 1) {
                System.out.printf(", ");
            }
        }

        System.out.println("]");
    }
}