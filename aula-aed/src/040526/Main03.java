import java.util.Scanner;

public class Main03 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;
        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
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

        System.out.println("Notas acima da media: ");

        for (int i = 0; i < nota.length; i++) {
            if (nota[i] >= media_turma) {
                System.out.println(nota[i]);
            }
        }
    }
}