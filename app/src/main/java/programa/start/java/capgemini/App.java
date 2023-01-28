/*
 * 8. Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em 
 * dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares 
 * disponíveis com o usuário;
 */
package programa.start.java.capgemini;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a cotação do dolar: ");
        double cotacaoDolar = sc.nextDouble();

        System.out.print("Informe a quantidades de dolares a serem convertidos para real: ");
        double quantidade = sc.nextDouble();

        double conversorDeMoeda = cotacaoDolar * quantidade;

        System.out.println("Cotação do dolar: $" + cotacaoDolar);
        System.out.println("Quantidade total em dolares com o usuário: $" + String.format("%.2f", quantidade));
        System.out
                .println("Quantidade em dolares convertidos para reais: R$" + String.format("%.2f", conversorDeMoeda));

        sc.close();
    }
}
