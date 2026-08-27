import java.util.Scanner;

public class Main01 {

    public static Scanner entrda = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valores_inteiros;
        System.out.print(msg);
        valores_inteiros = entrda.nextInt();
        return valores_inteiros;
    }

    public static void main(String[] args) {
        int[] nota;
        int qtde_notas, soma_notas = 0;
        float media_turma;

        System.out.println("Quantas notas serao digitas?");
        qtde_notas = entrda.nextInt();
        nota = new int[qtde_notas];

        for (int i = 0; i < qtde_notas; i++) {
            nota[i] = entrda.nextInt();
            soma_notas += nota[i];
        }

        media_turma = (float) soma_notas / qtde_notas;

        System.out.println("Notas acima de media");

        for (int i = 0; i < qtde_notas; i++) {
            if (nota[i] >= media_turma) {
                System.out.println(nota[i]);
            }
        }
    }
}