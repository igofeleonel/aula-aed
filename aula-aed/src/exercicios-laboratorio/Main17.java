import java.util.Scanner;

public class Main17 {

    public static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {

        System.out.print("Entre com o número do dia: ");
        int dia = entrada.nextInt();

            switch(dia){
                case 1:
                    System.out.println("Domingo\n");
                break;
                case 2:
                    System.out.println("Segunda-feira\n");
                break;
                case 3:
                    System.out.println("Terça-feira\n");
                break;
                case 4:
                    System.out.println("Quarta-feira\n");
                break;
                case 5:
                    System.out.println("Quinta-feira\n");
                break;
                case 6:
                    System.out.println("Sexta-feira\n");
                break;
                case 7:
                    System.out.println("Sábado\n");
                break;
                default:
                    System.out.println("Número inválido");
        }

        entrada.close();
    }
}
