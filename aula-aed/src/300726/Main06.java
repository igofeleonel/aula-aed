import java.util.Scanner;

public class Main06 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiros(String msg) {
        int valores_inteiro;
        System.out.print(msg);
        valores_inteiro = entrada.nextInt();
        return valores_inteiro;
    }

    public static void main(String[] args) {
        int n = lerInteiros("");
        int i;
        int[] pares = new int[n];
        int[] impares = new int[n];

        int qtde_pares = 0;
        int qtde_impares = 0;

        for (i = 0; i < n; i++) {
            int numeros = lerInteiros("");

            if (numeros % 2 == 0) {
                pares[qtde_pares] = numeros;
                qtde_pares++;
            } else {
                impares[qtde_impares] = numeros;
                qtde_impares++;
            }
        }

        System.out.println("Pares: " + qtde_pares);
        System.out.print("[");

        for (i = 0; i < qtde_pares; i++) {
            System.out.print(pares[i]);

            if (i < qtde_pares - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
        System.out.println("Impares: " + qtde_impares);
        System.out.print("[");

        for (i = 0; i < qtde_impares; i++) {
            System.out.print(impares[i]);

            if (i < qtde_impares - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}