/*
 * 30. Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro valor inteiro: ");
        int a = sc.nextInt();
        System.out.println("Informe o segundo valor inteiro: ");
        int b = sc.nextInt();
        System.out.println("Informe o terceiro valor inteiro: ");
        int c = sc.nextInt();

        if (a < b && a < c) {
            if (b < c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else {
            if (a < b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}
