/*
 * 12. O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
 * dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
 * do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
 * 45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo;
 */
package programa.start.java.capgemini;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double custoFabrica, custoDistribuidor, custoImpostos, custoConsumidor;

        final double PERC_DISTRIBUIDOR = 0.28;
        final double PERC_IMPOSTOS = 0.45;

        System.out.print("Informe o custo de fabrica do produto: R$");
        custoFabrica = sc.nextDouble();

        custoImpostos = custoFabrica * PERC_IMPOSTOS;
        custoDistribuidor = (custoFabrica + custoImpostos) * PERC_DISTRIBUIDOR;
        custoConsumidor = custoFabrica + custoImpostos + custoDistribuidor;

        System.out.println("Custo ao consumidor: R$" + String.format("%.2f", custoConsumidor));

        sc.close();
    }
}
