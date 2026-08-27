import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valores_inteiros;
        System.out.print(msg);
        valores_inteiros = entrada.nextInt();
        return valores_inteiros;
    }

    public static void main(String[] args) {
        int[] nota = { 0, 0, 0, 0, 0 };
        int soma_notas = 0;
        float media_turma;

        System.out.println("Entre com as 5 notas");
        for (int i = 0; i < nota.length; i++) {
            nota[i] = entrada.nextInt();
        }

        for (int i = 0; i < nota.length; i++) {
            soma_notas += nota[i];
        }

        media_turma = (float) soma_notas / nota.length;

        System.out.println("Notas acima da media");

        for (int i = 0; i < nota.length; i++) {
            if (nota[i] >= media_turma) {
                System.out.println(nota[i]);
            }
        }
    }
}