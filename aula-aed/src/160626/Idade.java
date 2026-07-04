import java.util.Scanner;

public class Idade {
    
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int idade = entrada.nextInt();
        System.out.print("A sua idade é essa: ");

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        }else{
            System.out.println("Você é menor de idade.");
        }
        entrada.close();
    }
}
