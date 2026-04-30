import java.util.Scanner;

public class Ex01 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("a: ");
        double a = entrada.nextDouble();
        System.out.print("b: ");
        double b = entrada.nextDouble();
        System.out.print("c: ");
        double c = entrada.nextDouble();
        System.out.print("d: ");
        double d = entrada.nextDouble();
        System.out.print("x1: ");
        double x1 = entrada.nextDouble();
        System.out.print("x2: ");
        double x2 = entrada.nextDouble();

        double y1 = a * x1 + b * x2;
        double y2 = c * x1 + d * x2; 

        System.out.println("y1: " + (int) y1);
        System.out.println("y2: " + (int) y2);
    }
}