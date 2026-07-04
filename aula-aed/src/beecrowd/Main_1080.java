import java.util.Scanner;

public class Main_1080 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int lerInteiro;
        System.out.println(mensagem);
        lerInteiro = entrada.nextInt();
        return lerInteiro;
    }

    public static void main(String[] args) {
        int maior = 0;
        int posMaior = 1;

        for(int i = 1; i <= 100; i++) {
            int x = entrada.nextInt();

            if (i == 1) {
                maior = x;
                posMaior = 1;
            } else if (x > maior) {
                maior = x;
                posMaior = i;
            }
        }
        System.out.println(maior);
        System.out.println(posMaior);
    }
}