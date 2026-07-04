
import java.util.Scanner;

public class Idade {
    
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int idade;
        int resultado;

        System.out.print("Digite a sua idade: ");
        idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.print("Voce é de maior de idade: ");
        }else{
            System.out.print("Voce é de menor de idade: ");
        }

        entrada.close();
    }
}