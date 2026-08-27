import java.util.Scanner;

public class Main04 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        System.out.print(msg);
        return entrada.nextInt();
    }

    public static void main(String[] args) {

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        for (int i = 0; i < A.length; i++) {
            A[i] = lerInteiro("");
        }

        for (int i = 0; i < B.length; i++) {
            B[i] = lerInteiro("");
        }

        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] - B[i];
        }

        System.out.print("[");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i]);

            if (i < C.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}