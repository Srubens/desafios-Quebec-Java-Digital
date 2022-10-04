// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.io.IOException;
import java.util.Scanner;
//TROCAR MAIN POR APP
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int T = leitor.nextInt();
        int[] N = new int[1000];
        int pos = 0;
        while (pos < 999) {
            for (int j = 0; j < T; j++) {
                if (pos > 999) break;
                N[pos] = j;
                pos++;
            }
        }

        for (int i = 0; i < N.length; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
    }
}