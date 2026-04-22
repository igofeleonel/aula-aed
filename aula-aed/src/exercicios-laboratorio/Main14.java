import java.util.Scanner;

public class Main14 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int mes;

        mes = 11;

        if (mes < 0 || mes > 12 ) {
            System.out.println("Mês incorreto.");
        }
        if (mes <=2) {
            System.out.println("Verão");
        }else {
            if (mes <=5) {
                System.out.println("Outono");
            } else {
                if (mes <=8) {
                    System.out.println("Inverno");
                } else
                {
                    if (mes <= 11) {
                        System.out.println("Primavera");
                    } 
                }
            }
        }
    }
}
