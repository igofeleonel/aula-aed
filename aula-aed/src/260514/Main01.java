public class Main01 {
    public static void main(String[] args) {
        int i, j, k = 0, n_i = 4, n_j = 1;

        while (k < 5) {
            for (i = 0; i < n_i; i++) {
                System.out.print("-"); 
            }
            for (j = 0; j < n_j; j++) {
                System.out.print("*");
            }
            for (i = 0; i < n_i; i++) {
                System.out.print("-");
            }
            System.out.println();

            k++;
            n_i--;
            n_j += 2;
        }
    }
}