import java.util.Scanner;

public class Main_1075 {
    public static Scanner entrada = new Scanner(System.in);

    public static int N(String mensagem){
        int N = entrada.nextInt();
        System.out.println(mensagem);
        return N;
    }

    public static void main(String[] args) {
        // váriaveis
        int valor_inteiro;
        int N = entrada.nextInt();

        for (int i =1;  i < 10000; i++ ) {
            
            if (i % N == 2) {
                System.out.println(i);
            }
        }
    }
}