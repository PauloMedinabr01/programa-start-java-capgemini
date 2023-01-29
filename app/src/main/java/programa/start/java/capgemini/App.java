/*
 * 24. Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Número " + n + " é positivo.");
        } else if (n < 0) {
            System.out.println("Número " + n + " é negativo.");
        } else {
            System.out.println("Número é igual a 0.");
        }
        sc.close();
    }
}
