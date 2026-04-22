import java.util.Scanner;

public class Main15 {
    public static Scanner entrada = new Scanner(System.in);

    public static double lerReal(String mensagem) {
        double valor_real;
        System.out.print(mensagem);
        valor_real = entrada.nextDouble(); // Lê um double da entrada padrão
        return valor_real;
    }

    public static char lerCaractere(String mensagem) {
        System.out.println(mensagem);
        return entrada.next() .charAt (0); // Lê o primeiro caractere digiitado
    }
    
    public static void main(String[] args) {
        //varáveis

        double valor_1, valor_2;
        char operador;

        valor_1 = lerReal("Primerio valor: ");
        valor_2 = lerReal("Segundo valor: ");
        operador = lerCaractere("Operação: ");

        if (operador == '+') {
            System.out.println(valor_1 + valor_2);
        } else {
            if (operador == '-') {
                System.out.println(valor_1 - valor_2);
            } else {
                if (operador == '*') {
                    System.out.println(valor_1 * valor_2);
                } else {
                    if (operador == '/') {
                        if (operador == '/') {
                            System.out.println("Divisão por zero não permitida");
                        } else {
                            System.out.println(valor_1 / valor_2);
                        }
                    } else {
                        System.out.println("Operação inválida");
                    }
                }
            }
        }
    }
}
