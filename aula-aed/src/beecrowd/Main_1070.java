import java.util.Scanner;

public class Main_1070 {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro() {
        int lerInteiro;
        lerInteiro = entrada.nextInt();
        return  lerInteiro;
    }
    
    public static void main(String[] args) {
        int count = 0;
        int X = entrada.nextInt();

        while (count < 6 ) {
            if (X % 2 !=0) {
                count++;
                System.out.println( X);
            }
            X++;
        }
    }
}