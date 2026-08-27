import java.util.Scanner;

public class Main07 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valor_inteiro;
        System.out.print(msg);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        System.out.print("Quantos alunos tem na turma? ");
        int quantidade = entrada.nextInt();

        double[] notas = new double[quantidade];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("\nA média da turma é: " + media);

        double maior = notas[0];
        double menor = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] > menor) {
                menor = notas[i];
            }
        }
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
    }
}