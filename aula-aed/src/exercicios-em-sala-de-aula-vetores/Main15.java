import java.util.Scanner;

public class Main15 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valores_inteiros;
        System.out.print(msg);
        valores_inteiros = entrada.nextInt();
        return valores_inteiros;
    }

    public static int[] alocarInteiros(int tam) {
        int[] v;
        v = new int[tam];
        return v;
    }

    public static void main(String[] args) {
        int[] resultado;
        resultado = alocarInteiros(50);
    }
}
