import java.util.Scanner;

public class Triangulo {

    public static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        int base;
        int altura;
        int area;

        // Entrada
        System.out.println("O usuário vai digitar o valor da altura: ");
        altura = entrada.nextInt();
        System.out.println("Digite o valor da base: ");
        base = entrada.nextInt();

        // Processamento
        area = base * altura / 2;
        System.out.println(area);
    }
}
