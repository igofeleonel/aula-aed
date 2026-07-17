// Conforme apresentado no módulo anterior, a decomposição identifica os subproblemas que compõem um problema maior. Cada subproblema dá origem a um módulo: um trecho de código nomeado que pode ser invocado sempre que necessário. Este módulo apresenta a sintaxe formal de definição e de chamada desses módulos, distinguindo dois tipos: procedimentos e funções.

import java.util.Scanner;

public class Main02 {
    static Scanner entrada = new Scanner(System.in);

    public static void exibirCabecalho() {
        System.out.println("===============================================");
        System.out.println("      BOLETIM DO ALUNO       ");
        System.out.println("===============================================");
    }

    public static String determinarSituacao() {
        System.out.print("Média do aluno: ");
        double m = entrada.nextDouble();
        if (m >= 7) {
            return "Aprovado";
        } else if (m >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static void exibirRodape() {
        System.out.println("===============================================");
    }

    public static void main(String[] args) {
        exibirCabecalho();
        String s = determinarSituacao();
        System.out.println("Situação: " + s);
        exibirRodape();
    }
}