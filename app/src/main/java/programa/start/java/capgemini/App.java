/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigoProduto = sc.nextInt();

        while (codigoProduto != 1 || codigoProduto != 2) {
            switch (codigoProduto) {
                case 1:
                    System.out.println("Tv LG 55 polegadas. ");
                    break;
                case 2:
                    System.out.println("Tv LG 65 polegadas. ");
                    break;
                default:
                    System.out.println("Digite um número entre 1 e 2. ");
                    break;
            }
            codigoProduto = sc.nextInt();
        }
    }
}
