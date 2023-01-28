/*
 * 6. Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A 
 * passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os
 * valores trocados; 
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        int A = sc.nextInt();

        System.out.println("Informe o valor de B: ");
        int B = sc.nextInt();

        int temp = A;
        A = B;
        B = temp;

        System.out.println("Valor de A trocado: " + A);
        System.out.println("Valor de B trocado: " + B);

        sc.close();
    }
}
