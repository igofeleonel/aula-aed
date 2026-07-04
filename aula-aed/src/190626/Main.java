import java.util.Scanner;

public class Main {
    
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        
        // pessoa
        System.out.println("Qual é o seu peso: ");
        double peso = entrada.nextDouble();

        // altura
        System.out.println("Qual é a sua altura: ");
        double altura = entrada.nextDouble();

        // imc
        double imc = peso / (Math.pow(altura, 2));
        
        
    }



}
