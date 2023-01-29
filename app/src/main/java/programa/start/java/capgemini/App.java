/*
 * 15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int numero = sc.nextInt();

        while (true) {
            if (numero > 100 && numero < 200) {
                System.out.println("O número está no intervalo entre 100 e 200. ");
                break;
            } else {
                System.out.println("O número informado não está no intervalo, por favor informe novamente.");
            }
            numero = sc.nextInt();
        }
        sc.close();
    }

}
