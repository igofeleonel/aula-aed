import java.util.Scanner;

public class Main_1065 {
    public static Scanner entrada = new Scanner(System.in);

    public static int valor_inteiros(String mensagem){
        int valor_inteiros = entrada.nextInt();
        System.out.println(mensagem);
        valor_inteiros = entrada.nextInt();
        return valor_inteiros;
    }

    public static void main(String[] args) {
        int valores_inteiros = 0;

        for (int i = 0; i<5; i++){
            int N = entrada.nextInt();

            if (N % 2 == 0) {
                valores_inteiros++;
            }
        }
        System.out.println(valores_inteiros + " valores pares");
    }
}
