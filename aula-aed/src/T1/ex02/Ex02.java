import java.util.Scanner;

public class Ex02 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("celsius: ");
        double celsius = entrada.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("fahrenheit: " + fahrenheit);

        entrada.close();
    }
}