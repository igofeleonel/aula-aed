import java.util.Scanner;

public class Main_1072 {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiros(String mensagem) {
        int lerInteiros;
        System.out.println(mensagem);
        lerInteiros = entrada.nextInt();
        return lerInteiros;
    }
    
    public static void main(String[] args) {
        int N = entrada.nextInt();
        int in = 0, out = 0;

        for( int i = 0; i < N; i++) {
            int X = entrada.nextInt();

            if (X >=10 && X <=20 ) {
                in++;
            } else {
                out++;
            }
        }

        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);
    }
}