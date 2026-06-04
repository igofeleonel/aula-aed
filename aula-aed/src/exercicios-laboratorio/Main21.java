import java.util.Scanner;

public class Main21 {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;
        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        int i;
        int numero_digitado;
        int qtde_pares = 0; 
        i = 0;
        while (i < 5) {
            numero_digitado = lerInteiro("Valor " + (i + 1) + ": ");
            
            if (numero_digitado % 2 == 0) {
                qtde_pares = qtde_pares + 1;
            }
            i++;
        }
        
        System.out.println(qtde_pares + " números pares foram digitados.");
    }
}