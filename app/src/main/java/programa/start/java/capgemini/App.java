/*
 * 14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Informe o primeiro número: ");
            int num1 = sc.nextInt();

            System.out.print("Informe o segundo número: ");
            int num2 = sc.nextInt();

            if (num1 > num2) {
                System.out.println("O maior número é: " + num1);
                break;
            } else if (num2 > num1) {
                System.out.println("O maior número é: " + num2);
                break;
            } else {
                System.out.println("Os números informados são iguais, por favor informe novamente.");
            }
        }
        sc.close();
    }
}
