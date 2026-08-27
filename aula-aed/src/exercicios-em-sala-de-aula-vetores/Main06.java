import java.util.Scanner;

public class Main06 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        System.out.print(msg);
        return entrada.nextInt();
    }

    public static void main(String[] args) {
        int[] valores = new int[10];
        int idx_pares = 0;
        int idx_impares = valores.length - 1;
        int valor;
        int i;

        for (i = 0; i < valores.length; i++) {
            valor = lerInteiro("");

            if (valor % 2 == 0) {
                valores[idx_pares] = valor;
                idx_pares++;
            } else {
                valores[idx_impares] = valor;
                idx_impares--;
            }
        }

        System.out.print("[");

        for (i = 0; i < valores.length; i++) {
            System.out.print(valores[i]);

            if (i < valores.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print(" ");
            }
        }

        System.out.println("]");
    }
}