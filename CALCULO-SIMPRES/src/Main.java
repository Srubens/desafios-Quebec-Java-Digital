// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.io.IOException;
import java.util.Scanner;
//TROCAR MAIN POR Problem
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int cod1 = leitor.nextInt();//12
        int n1 = leitor.nextInt();//1
        double valor1 = leitor.nextDouble();//5.30

        int cod2 = leitor.nextInt();//16
        int n2 = leitor.nextInt();//2
        double valor2 = leitor.nextDouble();//5.10

// TODO: Implemente um Cálculo Simples.
// Levando em consideração a sua precedência de operadores e a definição de suas casas decimais:

        double total = ( (double) n1 * valor1 ) + ( (double) n2 * valor2 );
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }

}