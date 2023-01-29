/*
 * 13. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = sc.nextInt();

        while (numero <= 10) {
            System.out.println("Digite um numero maior que 10: ");
            numero = sc.nextInt();
            if (numero > 10) {
                System.out.println("Numero: " + numero + " - maior que 10. ");
            }
        }
        sc.close();
    }
}
