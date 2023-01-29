/*
 * Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta
 * ou não para cumprir o serviço militar obrigatório. Informe os totais;
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, idade;
        int contadorApto = 0;
        int contadorInapto = 0;
        String nome, sexo, saude;
  
        System.out.print("Quantas pessoas serão informadas: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Pessoa " + (i + 1));
            System.out.print("Nome: ");
            nome = sc.next();
            System.out.print("Sexo (M/F): ");
            sexo = sc.next();
            System.out.print("Idade: ");
            idade = sc.nextInt();
            System.out.print("Condição de saúde (apto/inapto): ");
            saude = sc.next();

            if (sexo.equalsIgnoreCase("M") && idade >= 18 && idade <= 45 && saude.equalsIgnoreCase("apto")) {
                System.out.println(nome + " é apto para o serviço militar");
                contadorApto++;
            } else {
                System.out.println(nome + " não é apto para o serviço militar");
                contadorInapto++;
            }
        }

        System.out.println("Total de pessoas aptas: " + contadorApto);
        System.out.println("Total de pessoas inaptas: " + contadorInapto);

        sc.close();
    }

}
