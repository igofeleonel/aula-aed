import java.util.Scanner;

public class Ex10 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;
        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {

        int somaNum;
        int i;
        int somaDivisores;

        somaNum = lerInteiro("");

        do {

            somaDivisores = 0;

            for (i = 1; i < somaNum; i++) {
                if (somaNum % i == 0) {
                    somaDivisores = somaDivisores + i;
                }
            }

            if (somaDivisores != somaNum) {
                somaNum++;
            }

        } while (somaDivisores != somaNum);

        System.out.println(somaNum);

    }
}