import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;
        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        int[] valores;
        int i, soma, qtde;
        double media;

        valores = new int[5];

        for (i = 0; i < valores.length; i++) {
            valores[i] = lerInteiro("");
        }

        soma = 0;
        for (i = 0; i < valores.length; i++) {
            soma = soma + valores[i];
        }

        media = soma / valores.length;

        qtde = 0;

        for (i = 0; i < valores.length; i++) {
            if (valores[i] >= media) {
                qtde++;
            }
        }

        System.out.println(qtde);

    }
}