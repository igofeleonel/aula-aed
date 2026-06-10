import java.util.Scanner;

public class Main_1073 {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiros(String mensagem) {
        int lerInteiros;
        System.out.println(mensagem);
        lerInteiros = entrada.nextInt();
        return lerInteiros;
    }

    public static void main(String[] args) {
        int N = entrada.nextInt();

        for (int i = 1; i <=N; i++) {
            if (i % 2 == 0) {

                System.out.println(i + "^2 = " + (i * i));
            }
        }
    }
}