public class Main {

    public static int[][] obterMatrizIdentidade(int ordem) {
        // Declaração da matriz
        int[][] matriz;

        // Alocação da matriz

        matriz = new int[ordem][ordem];

        preencherMatriz(matriz, 0);

        // Preenche a diagnoal principal

        for (int i = 0; i < ordem; i++) {
            matriz[i][i] = 1;
        }

        return matriz;

    }


    public static void main(String[] args) {


    }

}