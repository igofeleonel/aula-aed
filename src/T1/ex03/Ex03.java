import java.util.Scanner;

public class Ex03 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Distancia: ");
        double distancia = entrada.nextDouble();

        System.out.print("Combustivel: ");
        double combustivel = entrada.nextDouble();

        double consumo = distancia / combustivel;

        System.out.println("Consumo: " + consumo + "Km/L");

        entrada.close();
    }
}