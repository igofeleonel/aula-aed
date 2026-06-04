import java.util.Scanner;

public class Main01 {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int senha; 

        do {
            senha = entrada.nextInt(); 

            if (senha != 2002) {
                System.out.println("Senha Invalida");
            }
        } while (senha != 2002); 

        System.out.println("Acesso Permitido");
        
        entrada.close(); 
    }
}