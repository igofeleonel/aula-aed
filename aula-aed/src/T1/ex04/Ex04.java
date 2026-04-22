import java.util.Scanner;

public class Ex04 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
       System.out.print("valor: ");
       int valor = entrada.nextInt();

       if (valor < 1 || valor > 600) {
        System.out.println("valor inválido! Digite um valor entre R$ 1,00 e R$600,00");
       } else {
            int restante = valor;

            int notas100 = restante / 100;
            restante = restante % 100;

            int notas50 = restante / 50;
            restante = restante % 50;

            int notas10 = restante /10;
            restante = restante % 10;

            int notas5 = restante / 5;
            restante = restante % 5;

            int notas1 = restante;

            if (notas100 > 0) {
                if (notas100 == 1) {
                    System.out.println(notas100 + " nota de R$100");
                } else {
                    System.out.println(notas100 + " notas de R$100");
                }
            }

            if (notas50 > 0) {
                if (notas50 == 1) {
                    System.out.println(notas50 + " nota de R$ 50");
                } else {
                    System.out.println(notas50 + " notas de R$50");
                }
            }

            if (notas10 > 0) {
                if (notas10 == 1) {
                    System.out.println(notas10 + " nota de R$ 10");
                } else {
                    System.out.println(notas10 + " notas de R$ 10");
                }
            }
        
            if (notas5 > 0) {
                if (notas5 == 1) {
                    System.out.println(notas5 + " nota de R$ 5");
                } else {
                    System.out.println(notas5 + " notas de R$ 5");
                }
            }

            if (notas1 > 0) {
                if (notas1 == 1) {
                    System.out.println(notas1 + " nota de R$ 1");
                } else {
                    System.out.println(notas1 + " notas de R$ 1");
                }
            }
       }

       entrada.close();
    }
}