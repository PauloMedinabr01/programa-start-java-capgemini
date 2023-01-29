/*
 * 27. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um algoritmo
 *  que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser calculado
 *  sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel –14%). 
 * Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos clientes;
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            System.out.print("Informe o valor do veículo: ");
            double valorVeiculo = sc.nextDouble();

            if (valorVeiculo == 0) {
                break;
            }

            System.out.print("Informe o tipo de combustível (Álcool, Gasolina ou Diesel): ");
            String combustivel = sc.next();

            double desconto = 0;
            if (combustivel.equalsIgnoreCase("Álcool")) {
                desconto = 0.25;
            } else if (combustivel.equalsIgnoreCase("Gasolina")) {
                desconto = 0.21;
            } else if (combustivel.equalsIgnoreCase("Diesel")) {
                desconto = 0.14;
            } else {
                System.out.println("Combustível inválido");
                continue;
            }

            double valorDesconto = valorVeiculo * desconto;
            double valorPago = valorVeiculo - valorDesconto;

            totalDesconto += valorDesconto;
            totalPago += valorPago;

            System.out.println("Valor do desconto: R$" + valorDesconto);
            System.out.println("Valor a ser pago: R$" + valorPago);
        }

        System.out.println("Total de desconto: R$" + totalDesconto);
        System.out.println("Total pago pelos clientes: R$" + totalPago);

        sc.close();
    }
}
