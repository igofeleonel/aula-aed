import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int valores_inteiros;
        System.out.print(msg);
        valores_inteiros = entrada.nextInt();
        return valores_inteiros;
    }

    public static int contarVogais(String s) {

        int qtde_vogais = 0;

        String s_minuscula = s.toLowerCase();

        for (int i = 0; i < s_minuscula.length(); i++) {
            switch (s_minuscula.charAt(i)) {
                case 'a':
                    qtde_vogais++;
                    break;
                case 'e':
                    qtde_vogais++;
                    break;
                case 'i':
                    qtde_vogais++;
                    break;
                case 'o':
                    qtde_vogais++;
                    break;
                case 'u':
                    qtde_vogais++;
                    break;
            }
        }

        return qtde_vogais;
    }

    public static String inverter(String s) {
        String invertida = "";

        for (int i = 0; i < s.length(); i++) {
            invertida = s.charAt(i) + invertida;
        }

        return invertida;
    }

    public static String removerEspacos(String s) {

        String resultado = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                resultado += s.charAt(i);
            }
        }

        return resultado;
    }

    public static boolean testarPalindromo(String s) {

        int ini = 0;
        int fim = s.length() - 1;

        while (ini < fim) {
            if (s.charAt(ini) != s.charAt(fim)) {
                return false;
            }

            ini++;
            fim--;
        }

        return true;
    }

    public boolean verificarSenha(String s) {

        if (s.length() < 6 || s.length() > 12) {
            return false;
        }

        if (s.equals(s.toLowerCase())) {
            return false;
        }

        boolean possui_digito = false;
        String numeros = "0123456789";

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < 10; j++) {

                if (s.charAt(i) == numeros.charAt(j)) {
                    possui_digito = true;
                    break;
                }
            }

            if (possui_digito) {
                break;
            }

        }

        return possui_digito;
    }

    public static String trocarCaracteres(String s, char a, char b) {

        if (s == null || s.length() == 0) {
            return s;
        }

        String resultado = "";

        for (int i = 0; i < s.length(); i++) {
            char caractere = s.charAt(i);

            if (caractere == a) {
                resultado = resultado + b;
            } else {
                resultado = resultado + caractere;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {

        String palavra = "ALGORITIMO";
        // Contagem de vogais
        // int n_vogais;

        // n_vogais = contarVogais(palavra);

        // System.out.println(palavra + "possui" + n_vogais + " vogais");

        // String invertida
        System.out.println(inverter(palavra));

        String frase = "boa noite pessoal";

        String onibus = "Subi no ônibus foi para marrocos";

        System.out.println(removerEspacos(frase));

        System.out.println("Frase ônibus é palíndromo?" + testarPalindromo(onibus));

        System.out.println(trocarCaracteres("banana", 'a', 'o'));

    }
}