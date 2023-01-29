/*
 * 23. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 80, 
 * menor que 25 ou igual a 40;
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (n > 80) {
            System.out.println("Número " + n + " é maior que 80.");
        } else if (n == 40) {
            System.out.println("Número " + n + " é igual a 40.");
        } else if (n < 25) {
            System.out.println("Número " + n + " é menor que 25.");
        } else {
            System.out.println("Número " + n + " não está nas condições.");
        }
        sc.close();
    }
}
