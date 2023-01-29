/*
 * 9. Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês. Considere fixo o juro da poupança em 
 * 0,07% a. m;
 */
package programa.start.java.capgemini;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor depositado: ");
        double valorDepositado = sc.nextDouble();

        double juros = valorDepositado * 0.0007;
        double valorFinal = valorDepositado + juros;

        System.out.println("Valor final com rendimento após um mês: " + String.format("%.2f", valorFinal));
       
        sc.close();
    }
}
