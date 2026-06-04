import java.util.Scanner;

public class Main28 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Digite um número: ");
        int n = entrada.nextInt();

        int divisores = 0;

        if (n <= 1) {
            System.out.println("Não é primo");
        } else {
            for(int i = 1; i<=n; i++){
                if (n % i == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                System.out.println("É primo");
            } else {
                System.out.println("Não é primo");
            }
        }
        entrada.close();
    }
}