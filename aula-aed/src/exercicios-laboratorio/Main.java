import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

    public static String lerString(String mensagem){
        // Variáveis
        String frase;

        System.out.print(mensagem);
        // Leitura do teclado
        frase = entrada.nextLine();

        // Retorno 
        return frase;
    }

     public static double lerReal(String mensagem){
        // Variáveis
        double valor_real;

        System.out.print(mensagem);
        // Leitura do teclado
        valor_real = entrada.nextDouble();

        // Retorno
        return valor_real;
    }

    public static int lerInteiro(String mensagem){
        // Variáveis
        int valor_inteiro;

        System.out.print(mensagem);
        // Leitura do teclado
        valor_inteiro = entrada.nextInt();

        // Retorno 
        return valor_inteiro;
    }
    
    public static void main(String[] args) {
        // Variáveis
        String nome;
        int codigo;
        double preco;

        nome = lerString("Produto: ");
        codigo = lerInteiro("Codigo: ");
        preco = lerReal("Preco: ");
        
        System.out.println("--------- Ficha do Produto ----------");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Código: %d\n", codigo);
        System.out.printf("Preco: %.2f\n", preco);
        System.out.println("----------------------------------");
    }
}
