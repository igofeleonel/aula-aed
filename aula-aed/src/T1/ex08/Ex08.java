import java.util.Locale;
import java.util.Scanner;

public class Ex08 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        entrada.useLocale(Locale.US);

        int numLado = 0;
        double lado = 0;
        double area = 0;

        System.out.print("lados: ");
        numLado = entrada.nextInt();
        System.out.print("lado: ");
        lado = entrada.nextDouble();

        if(numLado == 3) {
            System.out.printf("TRIÂNGULO\n");
            area = (Math.sqrt(3) / 4) * Math.pow(lado, 2);
            System.out.printf(Locale.US, "area: %.2f\n", area);
        }else if (numLado == 4) {
            System.out.printf("QUADRADO\n");
            area = lado * lado;
            System.out.printf( Locale.US, "area: %.1f", area);
        }else if (numLado == 5) {
            System.out.print("PENTÁGONO\n");
            area = (5 * lado * lado) / (4 * Math.tan(Math.PI / 5));
            System.out.printf(Locale.US, "area: %.2f\n", area);
        }else if (numLado < 3) {
            System.out.println("NÃO É UM POLÍGONO");
        }else if (numLado > 5) {
            System.out.println("POLÍGONO NÃO IDENTIFICADO.");
        }
    }
}