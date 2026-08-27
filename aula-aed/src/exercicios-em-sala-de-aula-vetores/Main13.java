import java.util.Scanner;

public class Main13 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valores_inteiros;
        System.out.print(msg);
        valores_inteiros = entrada.nextInt();
        return valores_inteiros;
    }

    public static void main(String[] args) {
        int i = lerInteiro(""), cont = 0, j;
        int[] valor;
        double[] nota;
        double media = 0.0;
        valor = new int[i];
        nota = new double[i * 4];

        for (i = 0; i < valor.length; i++) {
            valor[i] = lerInteiro("");

            for (j = cont; j < cont + 4; j++) {
                nota[j] = lerInteiro("");
            }

            cont += 4;

        }

        cont = 0;

        System.out.printf("id\tmédia\tstatus\n--------------------\n");

        for (i = 0; i < valor.length; i++) {
            for (j = cont; j < cont + 4; j++) {
                media += nota[j];
            }

            media = media / 4;
            cont += 4;

            if (media >= 70.00) {
                System.out.printf("%d\t%.2f\tAprovado\n", valor[i], media);
            } else {
                System.out.printf("%d\t%.2f\tReprovado\n", valor[i], media);
            }

            media = 0.0;

        }
    }
}