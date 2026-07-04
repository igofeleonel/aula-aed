import java.util.Scanner;

public class Main_1099 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int lerInteiro;
        System.out.println(mensagem);
        lerInteiro = entrada.nextInt();
        return lerInteiro;
    }
    
    public static void main(String[] args) {
        int n, x, y, soma;

        n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            soma = 0;
            x = entrada.nextInt();
            y = entrada.nextInt();

            if (x < y) {
                for (int j=x+1; j<y; j++) {
                    if (j % 2 !=0 ) {
                        soma+=j;
                    }
                }
            }
            else {
                for (int j=y+1; j<x; j++) {
                    if (j % 2 !=0) {
                        soma+=j;
                    }
                }
            }

            System.out.println(soma);

        }

        entrada.close();
    }
}