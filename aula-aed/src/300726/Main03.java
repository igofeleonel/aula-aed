import java.util.Scanner;

public class Main03 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;
        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        // Declar variáveis e Declarar inicializar o vetor
        int[] valores = new int[10];
        int inicio = 0;
        int fim = valores.length - 1;
        int i;

        // Recebe os dados da entrada
        for (i = 0; i < 10; i++) {
            int num = lerInteiro("Digite o valor: ");
            if (num % 2 == 0) {
                valores[inicio] = num;
                inicio++;
            } else {
                valores[fim] = num;
                fim--;
            }
        }

        // Saída
        System.out.print("[");

        for (i = 0; i < valores.length; i++) {
            System.out.print(valores[i]);
            if (i < valores.length - 1) {
                System.out.print(", ");
            }
        }

        // Saída
        System.out.print("]");
    }
}