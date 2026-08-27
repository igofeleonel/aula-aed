public class Main {

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = valor;
            }
        }

        // Printa a matriz
        for (int i = 0; i < m.length; i++) {
            System.out.print("[");
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
                if (j < m[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
    }


    public static int[][] obterMatrizIdentidade(int ordem)  {
        // Declaração da matriz e alocação da matriz
        int[][] matriz = new int[ordem][ordem];

        // Preenche a diagnoal principal
        for (int i = 0; i < ordem; i++) {
            matriz[i][i] = 1;
        }


        // Retorno da matriz
        return matriz;
    }

    public static int[][] obterMatrizComBordaUm(int n_linhas, int n_colunas ) {
        // Declaração da matriz
        int[][] matriz;

        // Alocação da matriz
        matriz = new int[n_linhas][n_colunas];

        // Preenchimento dos valores
        for (int j=0; j < n_colunas; j++) {
            // linha superior 
            matriz[0][j] = 1;
            // linha inferior
            matriz[n_linhas-1][j] = 1;
        }

        for (int i = 0; i < n_linhas; i++) {
            // coluna esquerda
            matriz[i][0] = 1;
            // coluna direita
            matriz[i][n_colunas-1] =1;
        }

        return matriz;

    }

    public static  int[][] obterMatrizComBorda(int n_linhas, int n_colunas)  {
        // Declaração da matriz
        int[][] matriz;

        // Alocação da matriz
        matriz = new int[n_linhas][n_colunas];

        // Preenchimento dos valores
        for (int j=0; j < n_colunas; j++) {
            matriz[0][j] = 1;
        }


        // Retorno da matriz
        return matriz;
    }


    public static void preencherMatriz(int[][] matriz, int valor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length;  j++) {
                matriz[i][j] = valor;
            }
        }
    }

    public static void main(String[] args) {

        // Declaração de matriz
        int[][] m;

        int[][] matriz = new int[3][3];

        // Alocação da matriz
        // m = new int[4][9];
        // m = new int[7][1];
        // m = new int[8][12];
        m = new int[7][7];

        // Valor
        int valor = 45;

        // Preenche a matriz com valor
        preencherMatriz(matriz, 0);
        System.out.println("Matriz com valor fixo");
        // Mostrar a matriz
        mostrarMatriz(m);


        preencherMatriz(m, 10);
        mostrarMatriz(m);
    }
}