/*
 * 25. Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam 
 * iguais imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o
 * maior;
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int m = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n = sc.nextInt();

        System.out.println("Numeros digitados: " + m + ", " + n);

        if (m == n) {
            System.out.println("Números iguais.");
        } else {
            System.out.println("Números diferentes.");
        }

        if (m > n) {
            System.out.println(m + " é o maior.");
        } else if (n > m) {
            System.out.println(n + " é o maior.");
        } else {

        }

        sc.close();
    }
}
