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
        int numero;

        while (true) {
            numero = 0;

            for (i = 1; i < somaNum; i++) {
                if (somaNum % i == 0) {
                    numero = numero + i;
                }
            }

            if (numero == somaNum) {
                System.out.println(somaNum);
                break;
            }
            somaNum++;
        }
    }
}