/*
 * 2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a 
 * divisão dos dois números lidos;
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Digite os valores de X e Y para efeutuar os calculos (soma, subtração, multiplicação e divisão.). ");
        System.out.print("Digite X: ");
        int x = sc.nextInt();
        System.out.print("Digite Y: ");
        int y = sc.nextInt();

        int soma = x + y;
        int subtracao = x - y;
        int multiplicacao = x * y;
        int divisao = x / y;

        System.out.println("A soma de X e Y é: " + soma);
        System.out.println("A subtração de X e Y é: " + subtracao);
        System.out.println("A multiplicação de X e Y é: " + multiplicacao);
        System.out.println("A divisão de X e Y é: " + divisao);

        sc.close();

    }
}
