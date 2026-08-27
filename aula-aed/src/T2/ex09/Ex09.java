import java.util.Scanner;

public class Ex09 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valores_inteiros;
        System.out.print(msg);
        valores_inteiros = entrada.nextInt();
        return valores_inteiros;
    }

    public static void main(String[] args) {

        int i;

        int valor01 = lerInteiro("");
        int valor02 = lerInteiro("");

        int x = Math.min(valor01, valor02);
        int y = Math.max(valor01, valor02);

        for (i = x; i <= y; i++) {
            if (ePerfeito(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean ePerfeito(int numero) {
        int i;
        int somaDivisores = 0;

        if (numero <= 1) {
            return false;
        }

        for (i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        return somaDivisores == numero;
    }
}