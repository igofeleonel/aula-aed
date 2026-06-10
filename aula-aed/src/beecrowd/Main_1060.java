import java.util.Scanner;

public class Main_1060 {

    public static Scanner entrada = new Scanner(System.in);

    public static double lerDouble() {
        double lerDouble;
        lerDouble = entrada.nextDouble();
        return lerDouble;
    }

    public static void main(String[] args) {
        // váriaveis
        double numeros;
        int numeros_positivos = 0;

        for (int i =1; i<=6; i++ ) {
            numeros = lerDouble();

            if (numeros >0) {
                numeros_positivos ++;
            }
        }

        System.out.println(numeros_positivos + " valores positivos");
    }
}
