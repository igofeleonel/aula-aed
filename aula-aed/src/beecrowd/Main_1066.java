import java.util.Scanner;

public class Main_1066 {
    public static Scanner entrada = new Scanner(System.in);

    public static int valor_inteiros(String mensagem){
        int valor_inteiros = entrada.nextInt();
        System.out.println(mensagem);
        valor_inteiros = entrada.nextInt();
        return valor_inteiros;
    }

    public static void main(String[] args) {
        int numero_positivo = 0;
        int numero_negativo = 0;
        int par = 0;
        int impar = 0;

        for (int i = 0; i < 5; i++) {
            int X = entrada.nextInt();

            if ( X % 2 == 0 ) {
                par++;
            }
            if ( X % 2 != 0 ) {
                impar++;
            }
            if (X > 0) {
                numero_positivo++;
            }
            if (X < 0) {
                numero_negativo++;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(numero_positivo + " valor(es) positivo(s)");
        System.out.println(numero_negativo + " valor(es) negativo(s)");
    }
}
