/*
 * 11. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o 
 * preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
 */
package programa.start.java.capgemini;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o preço de custo do produto: ");
        double precoCusto = sc.nextDouble();

        System.out.print("Informe o percentual de acrescimo: ");
        double percentualAcrescimo = sc.nextDouble();

        double valorVenda = precoCusto + (precoCusto * (percentualAcrescimo / 100));

        System.out.println("Preço de custo: R$" + String.format("%.2f", precoCusto));
        System.out.println("Percentual do acrescimo: R$" + String.format("%.2f", percentualAcrescimo));
        System.out.println("Valor de venda: R$" + String.format("%.2f", valorVenda));

        sc.close();
    }
}
