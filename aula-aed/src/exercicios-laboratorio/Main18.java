import java.util.Scanner;

public class Main18 {
    
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Entre com o número do dia: ");
        int mes = entrada.nextInt();

         switch(mes){
            // Verão
            case 12:
            case 1:
            case 2:
                System.out.printf("Verão\n");
            break;

            // Outono
            case 3:
            case 4:
            case 5:
                System.out.println("Outono");
                break;

            // Inverno
            case 6:
            case 7:
            case 8:
                System.out.println("Inverno");
                break;

            // Primavera
            case 9:
            case 10:
            case 11:
                System.out.println("Primavera");
                break;
            
            default:
                System.out.println("Mês inválido");
         }
    }
}