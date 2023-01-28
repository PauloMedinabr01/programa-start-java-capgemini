/*
 * 3. Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
 * total percorrida pelo automóvel e o total de combustível gasto;
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a distância percorrida em km: ");
        double distanciaPercorrida = sc.nextDouble();

        System.out.println("Informe a quantidade de combustível usado em litros: ");
        double quantidadeCombustivelUsado = sc.nextDouble();

        System.out.println("Informe o preço do combustível por litro: ");
        double precoCombustivel = sc.nextDouble();

        double mediaConsumo = distanciaPercorrida / quantidadeCombustivelUsado;
        double totalGasto = precoCombustivel * quantidadeCombustivelUsado;

        System.out.println("Média de consumo: " + mediaConsumo + " km/l");
        System.out.println("Total gasto: R$ " + totalGasto);

        sc.close();

    }
}
