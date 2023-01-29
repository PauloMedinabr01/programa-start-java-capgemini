/*
 * A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça 
 * um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O 
 * desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
 * sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
 * Informar total de carros com ano até 2000 e total geral;
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contadorCarrosAntigos = 0;
        int contadorCarrosGeral = 0;

        while (true) {
            System.out.print("Informe o ano do carro: ");
            int anoCarro = sc.nextInt();

            System.out.print("Informe o valor do carro: ");
            double valorCarro = sc.nextDouble();

            double valorDesconto;
            if (anoCarro <= 2000) {
                valorDesconto = valorCarro * 0.12;
                contadorCarrosAntigos++;
                contadorCarrosGeral++;
            } else {
                valorDesconto = valorCarro * 0.07;
                contadorCarrosGeral++;
            }

            double valorAPagar = valorCarro - valorDesconto;

            System.out.println("Valor do desconto: R$ " + String.format("%.2f", valorDesconto));
            System.out.println("Valor a ser pago: R$ " + String.format("%.2f", valorAPagar));

            System.out.print("Deseja continuar calculando desconto? (S/N): ");
            String continuar = sc.next();

            if (continuar.equalsIgnoreCase("N")) {
                break;
            }

        }

        System.out.println("Total de carros com ano até 2000: " + contadorCarrosAntigos);
        System.out.println("Total geral de carros: " + contadorCarrosGeral);

        sc.close();

    }
}
