/*
 * 10. A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco) prestações sem juros. Faça um algoritmo
 * que receba um valor de uma compra e mostre o valor das prestações;
 */
package programa.start.java.capgemini;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da compra para calcular as prestações: ");
        double valorCompra = sc.nextDouble();

        double prestacoes = valorCompra / 5;

        System.out.println("Valor total da compra: R$" + String.format("%.2f", valorCompra));
        System.out.println("Valor das 5 prestações sem juros: R$" + String.format("%.2f", prestacoes));

        sc.close();
    }
}
