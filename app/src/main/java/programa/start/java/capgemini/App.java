/*
 * 16. Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. 
 * Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), 
 * Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9);
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Informe as notas do aluno");
        System.out.print("Digite a primeira nota: ");

        int n1 = sc.nextInt();

        System.out.print("Digite a segunda nota: ");
        int n2 = sc.nextInt();

        System.out.print("Digite a terceira nota: ");
        int n3 = sc.nextInt();

        int soma = n1 + n2 + n3;
        double media = soma / 3;

        System.out.println("Soma das 3 notas: " + soma);
        System.out.println("Média das 3 notas: " + media);

        if (media <= 5) {
            System.out.println("Aluno " + nome + " reprovado.");
        } else if (media > 5.1 && media <= 6.9) {
            System.out.println("Aluno " + nome + " em recuperação.");
        } else {
            System.out.println("Aluno " + nome + " aprovado.");
        }

        sc.close();
    }

}
