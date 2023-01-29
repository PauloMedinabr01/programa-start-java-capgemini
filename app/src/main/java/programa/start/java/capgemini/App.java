/*
 * 22. Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado
 * se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
 * de venda de cada produto, a média de preço de custo e do preço de venda;
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int qtdProdutos = 40;
        double[] precosCusto = new double[qtdProdutos];
        double[] precosVenda = new double[qtdProdutos];
        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;

        for (int i = 0; i < qtdProdutos; i++) {
            System.out.print("Informe o preço de custo do produto " + (i + 1) + ": ");
            precosCusto[i] = sc.nextDouble();
            System.out.print("Informe o preço de venda do produto " + (i + 1) + ": ");
            precosVenda[i] = sc.nextDouble();
            somaPrecoCusto += precosCusto[i];
            somaPrecoVenda += precosVenda[i];

            if (precosVenda[i] > precosCusto[i]) {
                System.out.println("Produto " + (i + 1) + " teve lucro.");
            } else if (precosVenda[i] < precosCusto[i]) {
                System.out.println("Produto " + (i + 1) + " teve prejuízo.");
            } else {
                System.out.println("Produto " + (i + 1) + " teve empate.");
            }
        }

        double mediaPrecoCusto = somaPrecoCusto / qtdProdutos;
        double mediaPrecoVenda = somaPrecoVenda / qtdProdutos;

        System.out.println("Média de preço de custo: " + mediaPrecoCusto);
        System.out.println("Média de preço de venda: " + mediaPrecoVenda);

        sc.close();
    }
}
