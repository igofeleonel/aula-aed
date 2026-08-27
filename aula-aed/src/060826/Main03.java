import java.util.Scanner;

public class Main03 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        System.out.print(msg);
        return entrada.nextInt();
    }

    public static void main(String[] args) {
        int n = lerInteiro("");
        int[] ids = new int[n];
        double[] medias = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            ids[i] = lerInteiro("");
            int nota1 = lerInteiro("");
            int nota2 = lerInteiro("");
            int nota3 = lerInteiro("");
            int nota4 = lerInteiro("");

            medias[i] = (nota1 + nota2 + nota3 + nota4) / 4.0;

            if (medias[i] >= 70.0) {
                status[i] = "Aprovado";
            } else {
                status[i] = "Reprovado";
            }
        }

        System.out.println("id\tmédia\tstatus");
        System.out.println("--------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t%s\n", ids[i], medias[i], status[i]);
        }
    }
}
