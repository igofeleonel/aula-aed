
import java.util.Scanner;

public class Main04 {
    public class Main02 {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String nome = lerString("Digite seu nome: ");
        System.out.println("Olá " + nome);
    }

    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextLine();
    }

}
}