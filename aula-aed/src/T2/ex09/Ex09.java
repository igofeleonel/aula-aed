import java.util.Scanner;

public class Ex09 {

    public static Scanner entrada = new Scanner(System.in);

    public static int InteiroPositivo(String mensagem) {
        int InteiroPositivo;
        System.out.print(mensagem);
        InteiroPositivo = entrada.nextInt();
        return InteiroPositivo;
    }

    public static void main(String[] args) {
        int x, y;
        int n;

        x = InteiroPositivo("");
        y = InteiroPositivo("");

        for (n = x; n <= y; n++) {
            if (ePerfeito(n)) {
                System.out.println(n);
            }
        }
    }

    public static boolean ePerfeito(int x) {
        int somaDivisores = 0;

        for (int i = 1; i <= (x / 2); i++) {
            if (x % i == 0) {
                somaDivisores = somaDivisores + i;
            }
        }
        return (x == somaDivisores);
    }
}