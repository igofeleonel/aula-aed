import java.util.Scanner;

public class Main_1071 {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiros(String mensagem) {
        int lerInteiros;
        System.out.println(mensagem);
        lerInteiros = entrada.nextInt();
        return lerInteiros;
    }

    public static void main(String[] args) {
        int x = entrada.nextInt();
        int y = entrada.nextInt();
        int minimo, maximo;

        if (x < y) {
            minimo = x;
            maximo = y;
        } else {
            minimo = y;
            maximo = x;
        }

        int soma = 0;
        for(int i = minimo+1; i < maximo; i++) {
            if (i % 2 != 0) {
                soma += i;  
            }
        }
        System.out.println(soma);
    }
}