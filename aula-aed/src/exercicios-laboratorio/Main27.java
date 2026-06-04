import java.util.Scanner;

public class Main27 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem){
        int numero;
        System.out.println(mensagem);
        numero = entrada.nextInt();
        return numero;
    }

    public static void main(String[] args) {
        int i, n;

        n = lerInteiro("Valor: ");

        for(i = 1; i <= n; i++){
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}