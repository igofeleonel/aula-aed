import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int n = entrada.nextInt();
        for(int i = 1; i < 10000; i++){
            if (i % n == 2) {
                System.out.println(i);
            }
        }
    }
}