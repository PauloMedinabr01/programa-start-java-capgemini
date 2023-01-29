/*
 * 18. Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
 * “menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int countMaior = 0;
        int countMenor = 0;
        int[] idadesMaiores = new int[5];
        int[] idadesMenores = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe uma idade: ");
            int idade = sc.nextInt();
            if (idade >= 18 && idade <= 75) {
                idadesMaiores[countMaior] = idade;
                countMaior++;
            } else if (idade < 18) {
                idadesMenores[countMenor] = idade;
                countMenor++;
            }
        }

        System.out.println("Foram encontrados " + countMaior + " pessoas maiores de idade.");
        System.out.println("Foram encontrados " + countMenor + " pessoas menores de idade.");

        System.out.print("As idades dos maiores encontradas foram: ");
        for (int i = 0; i < countMaior; i++) {
            System.out.print(idadesMaiores[i] + " ");
        }
        System.out.println();

        System.out.print("As idades dos menores encontradas foram: ");
        for (int i = 0; i < countMenor; i++) {
            System.out.print(idadesMenores[i] + " ");
        }
        sc.close();

    }
}
