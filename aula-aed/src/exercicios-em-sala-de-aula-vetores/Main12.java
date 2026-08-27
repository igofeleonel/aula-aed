import java.util.Scanner;

public class Main12 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valor_inteiro;
        System.out.print(msg);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        int i, alunos = 5;
        int cont_menor = 0, cont_maior = 0, idx_menor = 0, idx_maior = 0;
        int[] numeros = new int[5];
        double[] alturas = new double[5];

        for (i = 0; i < alunos; i++) {
            numeros[i] = lerInteiro("");
            alturas[i] = entrada.nextDouble();
        }

        double menor_altura = alturas[0];
        double maior_altura = alturas[0];

        for (i = 1; i < alunos; i++) {

            if (alturas[i] > maior_altura) {
                maior_altura = alturas[i];
            }

            if (alturas[i] < menor_altura) {
                menor_altura = alturas[i];
            }

        }

        for (i = 0; i < alunos; i++) {

            if (alturas[i] == menor_altura) {
                cont_menor++;
                idx_menor = i;
            }

            if (alturas[i] == maior_altura) {
                cont_maior++;
                idx_maior = i;
            }
        }

        if (cont_menor == 1) {
            System.out.println(
                    "O aluno " + numeros[idx_menor] + " é o mais baixo da turma, com " + menor_altura + "m de altura.");
        } else {
            System.out.println(cont_menor + " alunos empatam com a menor altura, de " + menor_altura + "m. São eles:");

            for (i = 0; i < alunos; i++) {
                if (alturas[i] == menor_altura) {
                    System.out.println("- aluno " + numeros[i]);
                }
            }
        }

        if (cont_maior == 1) {
            System.out.println(
                    "O aluno " + numeros[idx_maior] + " é o mais alto da turma, com " + maior_altura + "m de altura.");
        } else {
            System.out.println(cont_maior + " alunos empatam com a maior altura, de " + maior_altura + "m. São eles:");

            for (i = 0; i < alunos; i++) {
                if (alturas[i] == maior_altura) {
                    System.out.println("- aluno " + numeros[i]);
                }
            }
        }
    }
}