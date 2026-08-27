public class Main {

    public static void mostrarMatriz(int[][] matriz) {

    }

    public static void preencherMatriz(int[][] matriz, int valor) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valor;
            }

        }

    }

    public static void main(String[] args) {

        // Declaração de matriz
        int[][] m;
        int[][] v;

        // Alocação da matriz
        // m = new int[4][9];
        // m = new int[7][1];
        // m = new int[8][12];
        m = new int[7][7];

        // Valor
        int valor = 45;

        // Preenche a matriz com valor
        preencherMatriz(m, valor);

        // Mostrar a matriz
        mostrarMatriz(m);

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
}