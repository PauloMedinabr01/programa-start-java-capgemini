/*
 * 1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores de X e Y para efeutuar a soma. ");
        System.out.print("Digite X: ");
        int x = sc.nextInt();
        System.out.print("Digite Y: ");
        int y = sc.nextInt();

        int soma = x + y;

        System.out.println("A soma de X e Y é: " + soma);

        sc.close();

    }
}
