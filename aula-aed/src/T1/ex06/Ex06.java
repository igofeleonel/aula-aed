import java.util.Scanner;

public class Ex06 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("ano: ");
        int ano = entrada.nextInt();

        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) ||(ano % 400 == 0);

        if (bissexto) {
            System.out.println("É bissexto");
        } else {
            System.out.println("Não é bissexto");
        }

        entrada.close();
    }
}
