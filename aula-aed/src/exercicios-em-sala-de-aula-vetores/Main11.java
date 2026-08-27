import java.util.Scanner;

public class Main11 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valores_inteiros;
        System.out.print(msg);
        valores_inteiros = entrada.nextInt();
        return valores_inteiros;
    }

    public static void main(String[] args) {
        int i;
        double maior = 0, menor = 0;
        int[] aluno;
        double[] altura;
        aluno = new int[5];
        altura = new double[5];

        for (i = 0; i < 5; i++) {
            aluno[i] = entrada.nextInt();
            altura[i] = entrada.nextDouble();
        }

        maior = altura[0];
        menor = altura[0];

        for (i = 1; i < 5; i++) {

            if (altura[i] > maior) {
                maior = altura[i];
            }

            if (altura[i] < menor) {
                menor = altura[i];
            }
        }

        for (i = 0; i < 5; i++) {

            if (altura[i] == menor) {
                System.out.printf("O aluno %d é o mais baixo da turma, com %.2fm de alura.%n", aluno[i], altura[i]);
            }
        }

        for (i = 0; i < 5; i++) {

            if (altura[i] == maior) {
                System.out.printf("O aluno %d é o mais alto da turma, com %.2fm de altura.%n", aluno[i], altura[i]);
            }
        }
    }
}