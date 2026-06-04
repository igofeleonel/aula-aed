import java.util.Scanner;
public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static char lerCaractere(String mensagem){
        char caractere;
        System.out.println(mensagem);
        caractere = entrada.next().charAt(0);
        return caractere;
    }

    public static int lerInteiro(String mensagem){
        int valor_inteiro;
        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static int fatorial(int X){
        int valor_fatorial = 1;
        int i;

        for(i=1; i<=X; i++) {
            valor_fatorial = valor_fatorial * i;
        }

        return valor_fatorial;
    }

    public static void main(String[] args) {

        int valor = lerInteiro("Valor: ");
        System.out.println("Fatorial: " + fatorial(valor));

    }
}
