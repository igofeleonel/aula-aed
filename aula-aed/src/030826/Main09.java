import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main09 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valor_inteiro;
        System.out.println(msg);
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        String[] opcoes = new String[] {
                "Anime HunterXHunter",
                "Série Game of Thrones",
                "Filme Vingadores",
                "Sair"
        };

        int opcaoEscolhida = 0;

        while (opcaoEscolhida != 3) {
            opcaoEscolhida = JOptionPane.showOptionDialog(null,
                    "O que você deseja assistir",
                    "DevFlix",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    0);

            if (opcaoEscolhida != 0) {
                String mensagem = "Você assistiu " + opcoes[opcaoEscolhida];
                JOptionPane.showMessageDialog(null, mensagem);
            }
        }
    }
}