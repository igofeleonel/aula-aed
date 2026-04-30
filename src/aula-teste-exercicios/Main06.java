import java.util.Scanner;

public class Main06 {
    public static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Variáveis
        double valor_1, valor_2;
        char operador;

        System.out.println("====");
        // System.out.println(args.length);
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // System.out.println(args[2]);

        valor_1 = Double.parseDouble(args[0]);
        valor_2 = Double.parseDouble(args[1]);
        operador = args[2].charAt(0);

        System.out.println(args.length);
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}
