import java.util.Scanner;

public class Nome {
    
    public final static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        String nome;

        // Pedir o nome do usuario
        System.out.println("Qual é o seu nome? ");

        // Usuario digita o seu nome
        nome = tc.nextLine();

        // imprimir o nome do usuario
        System.out.println("Seu nome é: " + nome);
    }
}
