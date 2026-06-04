import java.util.Scanner;

public class Main26 {

    public static Scanner entrada = new Scanner(System.in);
    
    public static int lerInteiro(String mensagem){
        int numero_inteiro;
        System.out.println(mensagem);
        numero_inteiro = entrada.nextInt();
        return numero_inteiro;
    }

    public static void main(String[] args) {
        int i;
        int n;
        int soma;

        n = lerInteiro("Valor Inteiro");

        soma = 0;
        for(i = 1; i <= n; i++){
            soma = soma + 2 * i;
        }

        System.out.println(soma);
    }
}