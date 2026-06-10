import java.util.Scanner;

public class Main_1064 {
    public static Scanner entrada = new Scanner(System.in);

    public static double lerPositivos(String mensagem) {
        double lerPositivos;
        System.out.println(mensagem);
        lerPositivos = entrada.nextDouble();
        return lerPositivos;
    }

    public static void main(String[] args) {
        int count = 0;
        double media = 0;
        double x;

        for (int i = 0; i < 6; i++) {
            x = entrada.nextDouble();

            if (x > 0) {
                count++;
                media +=x;
            }
        }

        media = media / count;

        System.out.println(count + " valores positivos");
        System.out.printf("%.1f\n", media);
    }
}