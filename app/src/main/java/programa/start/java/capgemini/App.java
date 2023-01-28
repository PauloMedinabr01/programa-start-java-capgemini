/*
 * 7. Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de 
 * conversão é: F= (9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius; 
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius: ");

        double celsius = sc.nextDouble();
        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        sc.close();
    }
}
