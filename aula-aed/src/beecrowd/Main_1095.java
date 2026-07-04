import java.util.Scanner;

public class Main_1095 {
    
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int lerInteiro;
        System.out.println(mensagem);
        lerInteiro = entrada.nextInt();
        return lerInteiro;
    }

    public static void main(String[] args) {
        for (int I=1, J=60; J>=0; I+=3,J-=5) {
            System.out.println("I="+I+" J="+J);
        }
    }
}