import java.util.Scanner;

public class Main09 {
    public static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        double valor_1, valor_2, resultado;
        char operador;

        System.out.print("Valor 1: ");
        valor_1 = entrada.nextDouble();

        System.out.print("Valor 2: ");
        valor_2 = entrada.nextDouble();

        System.out.print("Operador: ");
        operador = entrada.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = valor_1 + valor_2;
                System.out.println((int) resultado); 
                break;
            case '-':
                resultado = valor_1 + valor_2;
                System.out.println((int) resultado); 
                break;
            case '*':
                resultado = valor_1 + valor_2;
                System.out.println((int) resultado); 
                break;
            case '/':
                if (valor_2 != 0) {
                    resultado = valor_1 / valor_2;
                    System.out.println(resultado);  
                } else {
                    System.out.println("Erro ao divisão por zero!");
                }
                break;
            default:
                System.out.println("Operador inválido");
        }
    }
}