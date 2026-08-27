import java.util.Scanner;

public class Main02 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valor_inteiro;
        System.out.print(msg);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        int nota1, nota2, nota3, nota4, nota5;
        int qtde_notas = 5, soma_notas;
        float media_turma;

        System.out.println("Entre com as 5 notas");

        nota1 = entrada.nextInt();
        nota2 = entrada.nextInt();
        nota3 = entrada.nextInt();
        nota4 = entrada.nextInt();
        nota5 = entrada.nextInt();

        soma_notas = nota1 + nota2 + nota3 + nota4 + nota5;
        media_turma = (float) soma_notas / qtde_notas;

        System.out.println("Notas acima de media: ");

        if (nota1 >= media_turma) {
            System.out.println(nota1);
        }

        if (nota2 >= media_turma) {
            System.out.println(nota2);
        }

        if (nota3 >= media_turma) {
            System.out.println(nota3);
        }

        if (nota4 >= media_turma) {
            System.out.println(nota4);
        }

        if (nota5 >= media_turma) {
            System.out.println(nota5);
        }
    }
}