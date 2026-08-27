import java.util.Scanner;

public class Main01 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valor_inteiro;
        System.out.println(msg);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        int[] vetorzao = new int[10];
        vetorzao[0] = 3;
        vetorzao[1] = 4;
        vetorzao[2] = 8;
        vetorzao[3] = 13;
        vetorzao[4] = 22;
        vetorzao[5] = 51;
        vetorzao[6] = 33;
        System.out.println("Primindo...");

        for (int i = 0; i < vetorzao.length; i++) {
            System.out.println(vetorzao[i]);
        }
    }
}