
import java.util.Scanner;

public class Main01 {
    public static double obterPi() {
        return 3.14193;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Raio: ");
        double raio = entrada.nextDouble();
        double area = obterPi() * raio * raio;
        System.out.println("Área: " + area);
    }
}
