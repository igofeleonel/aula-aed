import java.util.Scanner;

public class Main_1067 {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro() {
        int lerInteiro;
        lerInteiro = entrada.nextInt();
        return  lerInteiro;
    }
    
    public static void main(String[] args) {
        // váriaveis
        int x = 1;

        x = lerInteiro();

        for (int i =1; i<=x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
