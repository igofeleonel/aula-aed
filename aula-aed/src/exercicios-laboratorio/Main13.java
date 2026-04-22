import java.util.Scanner;

public class Main13 {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        double vendas = entrada.nextDouble();

        double comissao;

        if (vendas <= 1000.00) {
            comissao = vendas * 0.05;
        } else if (vendas <= 50000.00) {
            comissao = vendas * 0.08;
        } else {
            comissao = vendas * 0.12;
        }

        System.out.printf("R$ %.2f\n", comissao);
        
        entrada.close();
    }
}
