public class TabelaVerdade {
    public static boolean bitTest(int value, int position) {
        int bit = (value >> position) & 1;
        if (bit != 0) {
            return true;
        } else {
            return false;
        }
        // ou simplesmente: return ((value >> postion) & 1) != 0;
    }

    public static boolean expressao4(boolean A, boolean B, boolean C, boolean D) {
        boolean R;
        R = !A && !B && !C && !D || // Modificar aqui
                !A && B && C && D ||
                A && !B && !C && D ||
                A && B && C && !D;

        return R;
    }

    public static void main(String[] args) {
        int numVariaveis = 4; // Modificar aqui

        int linhas = (int) Math.pow(numVariaveis, 2);

        System.out.printf("Tabela para %d variáveis, %d possibilidades\n\n", numVariaveis, linhas);

        // Cabeçalho
        System.out.printf("\t");
        for (int i = 0; i < numVariaveis; i++) {
            System.out.printf(" %c\t", 'A' + i);
        }
        System.out.printf(" |\t s\n");

        System.out.printf("\t");
        for (int i = 0; i < numVariaveis; i++) {
            System.out.printf("-----\t");
        }

        System.out.printf("  |\t-----\t");

        for (int i = 0; i < linhas; i++) {
            boolean A = bitTest(i, 3);
            boolean B = bitTest(i, 2);
            boolean C = bitTest(i, 1);
            boolean D = bitTest(i, 0);
            boolean E = bitTest(i, 0);

            boolean S = expressao4(A, B, C, D); // Modificar aqui

            System.out.printf("%d\t", i);

            System.out.printf("%b\t", A);
            System.out.printf("%b\t", B);
            System.out.printf("%b\t", C); // Modificar aqui!
            System.out.printf("%b\t", D); // Modificar aqui!

            System.out.printf("  |\t%b\n", S);

            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
    }
}
