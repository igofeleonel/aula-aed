import java.util.Scanner;

public class Main07 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valores_inteiro;
        System.out.print(msg);
        valores_inteiro = entrada.nextInt();
        return valores_inteiro;
    }

    public static void main(String[] args) {
        int i, n = lerInteiro("");
        int[] valores;
        int pares = 0;
        int impares = 0;

        valores = new int[n];

        for (i = 0; i < valores.length; i++) {
            valores[i] = lerInteiro("");

            if (valores[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.printf("Pares: %d\n[", pares);

        int cont = 0;

        for (i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0) {

                if (cont > 0) {
                    System.out.print(", ");
                }

                System.out.print(valores[i]);
                cont++;
            }
        }

        System.out.println("]");

        System.out.printf("Ímpares: %d\n[", impares);

        cont = 0;

        for (i = 0; i < valores.length; i++) {
            if (valores[i] % 2 != 0) {
                if (cont > 0) {
                    System.out.print(", ");
                }

                System.out.print(valores[i]);
                cont++;
            }
        }

        System.out.println("]");

    }
}