/*
 * 4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas 
 * por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas 
 * efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome do vendedor: ");
        String nomeDoVendedor = sc.nextLine();

        System.out.print("Informe o salário fixo do vendedor: ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Informe o total de vendas no mês (em dinheiro): ");
        double totalDeVendas = sc.nextDouble();

        double comissao = totalDeVendas * 0.15;
        double salarioTotal = comissao + salarioFixo;

        System.out.println("vendedor: " + nomeDoVendedor);
        System.out.println("Salário fixo: R$ " + String.format("%.2f", salarioFixo));
        System.out.println("Valor da comissão: R$ " + String.format("%.2f", comissao));
        System.out.println("Salário no final do mês: R$ " + String.format("%.2f", salarioTotal));

        sc.close();

    }
}
