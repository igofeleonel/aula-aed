import java.util.Scanner;

public class Main05 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        System.out.println(msg);
        return entrada.nextInt();
    }

    public static void main(String[] args) {
        int[] va = new int[10];
        int[] vb = new int[10];
        int[] vc = new int[10];

        int i;

        for (i = 0; i < 10; i++) {
            va[i] = entrada.nextInt();
        }

        for (i = 0; i < 10; i++) {
            vb[i] = entrada.nextInt();
        }

        for (i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                vc[i] = va[i] + vb[i];
            } else {
                vc[i] = va[i] - vb[i];
            }
        }

        System.out.print("va: [");
        for (i = 0; i < 10; i++) {
            System.out.print(va[i]);

            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("vb: [");
        for (i = 0; i < 10; i++) {
            System.out.print(vb[i]);

            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("vc: [");
        for (i = 0; i < 10; i++) {
            System.out.print(vc[i]);

            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}