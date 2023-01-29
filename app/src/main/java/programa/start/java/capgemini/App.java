/*
 * 19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher.
 * No final informe total de homens e de mulheres;
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int countHomem = 0;
        int countMulher = 0;
        String[] homens = new String[56];
        String[] mulheres = new String[56];

        for (int i = 0; i < 56; i++) {
            System.out.print("Informe o nome: ");
            String nome = sc.nextLine();
            System.out.print("Informe o sexo (M/F): ");
            String sexo = sc.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                System.out.println(nome + " é um homem.");
                homens[countHomem] = nome;
                countHomem++;
            } else if (sexo.equalsIgnoreCase("F")) {
                System.out.println(nome + " é uma mulher.");
                mulheres[countMulher] = nome;
                countMulher++;
            } else {
                System.out.println("Sexo inválido, por favor informe novamente.");
                i--;
            }
        }

        System.out.println("Foram encontrados " + countHomem + " homens.");
        System.out.println("Foram encontrados " + countMulher + " mulheres.");

        System.out.print("Os homens são: ");
        for (int i = 0; i < countHomem; i++) {
            System.out.print(homens[i] + " ");
        }
        System.out.println();
        System.out.print("As mulheres são: ");
        for (int i = 0; i < countMulher; i++) {
            System.out.print(mulheres[i] + " ");
        }
        sc.close();

    }
}
