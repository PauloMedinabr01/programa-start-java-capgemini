/*
 * 16. Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
 * (inclusive);
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int[] numeros = new int[80];

        for (int i = 0; i < 80; i++) {
            System.out.print("Informe um número: ");
            int numero = sc.nextInt();
            if (numero >= 10 && numero <= 150) {
                numeros[count] = numero;
                count++;
            }
        }

        System.out.println("Foram encontrados " + count + " números no intervalo entre 10 e 150.");
        System.out.print("Os números encontrados foram: ");
        for (int i = 0; i < count; i++) {
            System.out.print(numeros[i] + " ");
        }
        sc.close();
    }
}
