import java.util.Scanner;

public class Main24 {

    // Entrada
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem){
        int valor_inteiro;
        System.out.println(mensagem);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    // Saida 
    public static void main(String[] args) {

    int i;
    int valor;

    valor = lerInteiro("Valor: ");

    for(i=0; i<=10; i++){
        System.out.println(valor + " x " + i + " = " + valor*i);
    }
}
}