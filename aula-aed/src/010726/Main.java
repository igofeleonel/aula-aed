
import java.util.Scanner;

public class Main {
    public static void exibirLinha() {
        System.out.println("===============================================");
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        exibirLinha();
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.println("Boa noite, " + nome);
        exibirLinha();
    }
}
