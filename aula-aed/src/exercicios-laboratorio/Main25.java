import java.util.Scanner;

public class Main25 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem){
        int valor_inteiro;
        System.out.println(mensagem);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        int i;
        int n;

        n = lerInteiro("Valor: ");

        for(i=1; i<= n; i++){
          System.out.println(i * i);
        } 
    }
}