import java.util.Scanner;

public class Main_1078 {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int lerInteiro;
        System.out.println(mensagem);
        lerInteiro = entrada.nextInt();
        return  lerInteiro;
    }

    public static void main(String[] args) {
        int resultado_valor = 0;
        int N = entrada.nextInt();

        for (int i = 1; i <=10; i++) {
            resultado_valor = i * N;
            System.out.println(i + " x " + N +" = " + resultado_valor);
        }
    }
}
