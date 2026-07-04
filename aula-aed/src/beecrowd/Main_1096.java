import java.util.Scanner;

public class Main_1096 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int lerInteiro;
        System.out.println(mensagem);
        lerInteiro = entrada.nextInt();
        return lerInteiro;
    }

    public static void main(String[] args) {
        for (int i=1; i<=9; i+= 2) {
            for(int I = i, J = 7; J >= 5; J -= 1){
                System.out.println("I=" + I + " J=" + J);
            }
        }
    }
}