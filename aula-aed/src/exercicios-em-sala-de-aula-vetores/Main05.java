import java.util.Scanner;

public class Main05 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valores_inteiros;
        System.out.print(msg);
        valores_inteiros = entrada.nextInt();
        return valores_inteiros;
    }

    public static void main(String[] args) {
        int i, cont = 0;
        int[] va, vb;
        va = new int[10];
        vb = new int[10];

        for (i = 0; i < va.length; i++) {
            va[i] = lerInteiro("");
        }

        for (i = 0; i < vb.length; i++) {

            if (va[i] % 2 == 0) {
                vb[cont] = va[i];
                cont++;
            }

        }

        for (i = 0; i < vb.length; i++) {
            if (va[i] % 2 != 0) {
                vb[cont] = va[i];
                cont++;
            }
        }

        System.out.print("[");

        for (i = 0; i < vb.length; i++) {

            System.out.print(vb[i]);

            if (i < vb.length - 1) {
                System.out.printf(", ");
            }
        }

        System.out.println("]");
    }
}