import java.util.Scanner;

public class Ex10 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int lerInteiro;
        System.out.print(mensagem);
        lerInteiro = entrada.nextInt();
        return lerInteiro;
    }

    public static void main(String[] args) {
        int somaNum = lerInteiro("");
        int i;
        int somaDivisores;

        while (true) {
            somaDivisores = 0;

            for (i = 1; i < somaNum; i++) {
                if (somaNum % i == 0) {
                    somaDivisores = somaDivisores + i;
                }
            }

            if (somaDivisores == somaNum) {
                System.out.println(somaNum);
                break;
            }
            somaNum++;
        }
    }
}