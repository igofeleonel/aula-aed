import java.util.Scanner;

public class Main07 {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        double nota;
        
        System.out.print("Nota do aluno: ");
        nota = entrada.nextDouble();

        if (nota >= 9.0) {
            System.out.println("Conceito A");
        } else if (nota >= 7.5) {
            System.out.println("Conceito B");
        } else if (nota >= 6.0) {
            System.out.println("Conceito C");
        } else {
            System.out.println("Conceito D - Reprovado");
        }
    }
}
