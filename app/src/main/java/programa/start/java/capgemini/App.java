/*
 * 5. Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
 * No final informar o nome do aluno e a sua média (aritmética);
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[3];
        double soma = 0;
        double media;

        System.out.println("Informe o nome do aluno: ");
        String nome = sc.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe a " + (i + 1) + "ª nota: ");
            notas[i] = sc.nextDouble();
            sc.nextLine();
            soma += notas[i];
        }

        media = soma / 3;

        System.out.println("Notas: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("Soma das notas no semestre: " + soma);
        System.out.println("Média das notas no semestre: " + String.format("%.2f", media));

        if (media < 5) {
            System.out.println("Aluno " + nome + " Reprovado. ");
        } else if (media >= 5 && media < 6) {
            System.out.println("Aluno " + nome + " em Recuperação. ");
        } else {
            System.out.println("Aluno " + nome + " Aprovado. ");
        }
        sc.close();
    }
}
