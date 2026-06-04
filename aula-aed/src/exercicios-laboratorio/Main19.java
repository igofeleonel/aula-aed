import java.util.Scanner;

public class Main19 {
    
   public static Scanner entrada = new Scanner(System.in);
   
   public static int lerInteiro(String mensagem){
       int valor_inteiro;
       System.out.print(mensagem);
       valor_inteiro = entrada.nextInt();
       return valor_inteiro;
   }

   public static void main(String[] args) {
       int valor_inicial;
       int valor_final;
       int i;

       // variáveis
       int valor_incial = lerInteiro("Valor inicial: ");
       valor_final =  lerInteiro("Valor final: ");

       i = valor_incial;
       while (i <= valor_final) {
           System.out.println(i);
           i = i+1;
       }
   }
}