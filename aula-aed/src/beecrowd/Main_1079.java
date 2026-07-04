import java.util.Scanner;

public class Main_1079 {

    public static Scanner entrada = new Scanner(System.in);

    public static double lerInteiro(String mensagem){
        double lerInteiro;
        System.out.println(mensagem);
        lerInteiro = entrada.nextInt();
        return lerInteiro;
    }
    public static void main(String[] args) {
        int N = entrada.nextInt();
        for (int i = 0; i < N; i++) {
            double n1 = entrada.nextDouble();
            double n2 = entrada.nextDouble();
            double n3 = entrada.nextDouble();

            double media = ((n1*2) + (n2*3) + (n3*5)) / 10;
            System.out.printf("%.1f\n", media);
        }
    }
}