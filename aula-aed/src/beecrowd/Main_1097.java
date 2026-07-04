import java.util.Scanner;

public class Main_1097 {

    public static Scanner entrada = new Scanner(System.in);
    
    public static int lerInteiro(String mensagem) {
        int lerInteiro;
        System.out.println(mensagem);
        lerInteiro = entrada.nextInt();
        return lerInteiro;
    }

    public static void main(String[] args) {
        int i = 1, j = 7;

        while (i <= 9) {

            System.out.printf("I=%d J=%d\n", i, j);
            System.out.printf("I=%d J=%d\n", i, j-1);
            System.out.printf("I=%d J=%d\n", i, j-2);

            i += 2;
            j += 2;
        }
    }
}