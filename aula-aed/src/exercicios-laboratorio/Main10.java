
import java.util.Scanner;

public class Main10 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        
        int menor = Math.min(a, Math.min(b, c));
        int maior = Math.max(a, Math.max(b, c));

        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
    }
}
