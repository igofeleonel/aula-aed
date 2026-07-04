import java.util.Scanner;

public class ExeWhile {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String tecla;

        do {
            System.out.print("Digite uma tecla: ");
            tecla = entrada.nextLine();
            System.out.println("Você digitou: " + tecla);
        }while (!tecla.equals("#"));

        System.out.println("Programa encerrado!");
        entrada.close();
    }
}
