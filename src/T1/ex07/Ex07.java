import java.util.Scanner;

public class Ex07 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String classificacao;
        int positivas = 0;

        System.out.print("Telefonou para a vítima? ");
        String r1 = entrada.nextLine().trim().toLowerCase();
        if (r1.equals("s")) positivas++;

        System.out.print("Esteve no local do crime? ");
        String r2 = entrada.nextLine().trim().toLowerCase();
        if (r2.equals("s")) positivas++;

        System.out.print("Mora perto da vítima? ");
        String r3 = entrada.nextLine().trim().toLowerCase();
        if (r3.equals("s")) positivas++;

        System.out.print("Devia para a vítima? ");
        String r4 = entrada.nextLine().trim().toLowerCase();
        if (r4.equals("s")) positivas++;

        System.out.print("Já trabalhou com a vítima? ");
        String r5 = entrada.nextLine().trim().toLowerCase();
        if (r5.equals("s")) positivas++;

        if (positivas == 5) {
            classificacao = "Assasino";
        } else if (positivas >= 3) {
            classificacao = "Cumplice";
        } else if (positivas == 2) {
            classificacao = "Suspeita";
        } else {
            classificacao = "Inocente";
        }

        System.out.println(classificacao);
        entrada.close();
    }
}   
