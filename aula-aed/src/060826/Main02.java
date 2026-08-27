import java.util.Scanner;

public class Main02 {

    public static Scanner entrada = new Scanner(System.in);

    public static double lerInteiro(String msg) {
        double valor_inteiro;
        System.out.print(msg);
        valor_inteiro = entrada.nextDouble();
        return valor_inteiro;
    }

    public static void main(String[] args) {

        int[] codigoAlunos = new int[5];
        double[] alturaAlunos = new double[5];

        for (int i = 0; i < codigoAlunos.length; i++) {
            codigoAlunos[i] = (int) lerInteiro("");
            alturaAlunos[i] = lerInteiro("");
        }

        double menorAltura = alturaAlunos[0];
        double maiorAltura = alturaAlunos[0];

        for (int i = 1; i < alturaAlunos.length; i++) {
            if (alturaAlunos[i] < menorAltura) {
                menorAltura = alturaAlunos[i];
            }

            if (alturaAlunos[i] > maiorAltura) {
                maiorAltura = alturaAlunos[i];
            }
        }

        for (int i = 0; i < alturaAlunos.length; i++) {
            if (alturaAlunos[i] == menorAltura) {
                System.out.println("O aluno " + codigoAlunos[i]
                        + " é o mais baixo da turma, com "
                        + alturaAlunos[i] + "m de altura.");
            }
        }

        for (int i = 0; i < alturaAlunos.length; i++) {
            if (alturaAlunos[i] == maiorAltura) {
                System.out.println("O aluno " + codigoAlunos[i]
                        + " é o mais alto da turma, com "
                        + alturaAlunos[i] + "m de altura.");
            }
        }

    }
}