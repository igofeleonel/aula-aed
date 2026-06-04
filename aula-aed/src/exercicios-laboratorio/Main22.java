import java.util.Scanner;

public class Main22 {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextInt();
    }

    public static void calcularMedia() { 
        int aprovados = 0;
        double nota;
        int i = 0;
        double soma_nota = 0;

        System.out.println("Registros de Notas do Sistema de Aprovação");

        while (i < 10) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            nota = entrada.nextDouble();
            soma_nota += nota;

            if (nota >= 7.0) {
                aprovados++; 
            }
            i++;
        }

        double media_turma = soma_nota / 10;

        System.out.println("\n" + aprovados + " alunos foram aprovados");
        System.out.println("Media da turma: " + media_turma);
    }  

    public static void main(String[] args) {
        int numero = -1;
        int qtde_positivos = 0;
        int qtde_negativos = 0;

        while (numero != 0) {
            numero = lerInteiro("Número:  ");

            if (numero > 0) {
                qtde_positivos = qtde_positivos + 1;
            } else if (numero < 0) {
                qtde_negativos = qtde_negativos + 1;
            }
        }

        System.out.println(qtde_positivos + " números positivos ");
        System.out.println(qtde_negativos + " números negativos");
    }
}