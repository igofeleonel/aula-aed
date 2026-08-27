import java.util.Scanner;

public class Main46 {

    public static Scanner entrada = new Scanner(System.in);

    public static void mostrarVetor(int[] v) {
        int i;

        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

        System.out.println();
    }

    public static void alterarVetor(int[] v) {
        System.out.println(v);
        v[5] = 0;
    }

    public static void alterarVariavelLocal(int x) {
        x = 100;
    }

    public static int somarVetor(int[] v) {
        int[] numeros;
        int i;
        int var_local;

        numeros = new int[3];
        numeros[0] = 3;
        return 0;
    }

    public static void definirValorVetor(int[] v, int valor) {
        for (int i = 0; i < v.length; i++) {
            v[i] = valor;
        }
    }

    // Exercise 23 Obter índice de valor inteiro

    public static int obterPosicao(int[] v, int valor, int pos_inicial) {

        for (int i = pos_inicial; i < v.length; i++) {
            if (v[i] == valor) {
                return i;
            }
        }

        return -1;
    }

    // Exercise 24 Função obterPosicaoReal

    public static int obterPosicaoReal(double[] v, double valor, int posicao_inicial) {

        for (int i = posicao_inicial; i < v.length; i++) {
            if (v[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    // Exercise 25 - Função obterPosicaoLogico

    // public static int obterPosicaoLogico(boolean[] v, boolean valor, int
    // pos_inicial) {

    // for (int i = pos_inicial; i < v.length; i++) {
    // if (v[i] == valor) {
    // return i;
    // }
    // }

    // }

    // Exercise 46 Valores iguais
    public static boolean valoresIguais(int[] v1, int[] v2) {

        if (v1.length != v2.length) {
            return false;
        }

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] != v2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] numeros = { 5, 8, 4, 3, 2, 8, 2, 9, 3, 4, 9, 2 };
        double[] numerosReais = { 1.0, 2.1, 3.2, 4.3, 5.4, 4.3, 3.2, 2.1, 1.0 };

        int[] numeros02 = { 5, 8, 4, 3, 2, 8, 2, 9, 3, 4, 9, 2 };
        int valor_buscar;
        int valor_posicao;
        int posicao_inicial;
        int resultadoReal = obterPosicaoReal(numerosReais, 3.2, 3);

        mostrarVetor(numeros);
        valor_buscar = 2;
        posicao_inicial = 0;
        posicao_inicial = 12;
        valor_posicao = obterPosicao(numeros, valor_buscar, posicao_inicial);

        System.out.println();
        System.out.println("O valor " + valor_buscar
                + " está na posição " + valor_posicao);
    }
}