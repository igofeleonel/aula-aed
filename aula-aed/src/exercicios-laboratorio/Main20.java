// Pergunta um número k ao usuário, e mostre a tabuada desse número, com
// múltiplos de 1 a 20

import java.util.Scanner;

public class Main20 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int k = entrada.nextInt();

        int i = 1;

        while (i <= 20) {
            System.out.println(k + " x " + i + " = " + (k * i));
            i++;
        }

        entrada.close();
    }
}