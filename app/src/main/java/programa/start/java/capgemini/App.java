/*
 * 28. Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo 
* com os seguintes critérios: 
* a. 50% para aqueles que ganham menos do que três salários mínimos;
* b. 20% para aqueles que ganham entre três até dez salários mínimos; 
* c. 15% para aqueles que ganham acima de dez até vinte salários mínimos; 
* d. 10% para os demais funcionários.
* Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário 
* reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa 
* vai aumentar sua folha de pagamento;
 */
package programa.start.java.capgemini;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numFuncionarios = 584;
        double salarioMinimo, salario, novoSalario, reajuste, totalReajuste = 0;
        String nomeFuncionario;

        System.out.print("Informe o valor do salário mínimo: ");
        salarioMinimo = sc.nextDouble();

        for (int i = 0; i < numFuncionarios; i++) {
            System.out.print("Informe o nome do funcionário: ");
            nomeFuncionario = sc.next();

            System.out.print("Informe o salário do funcionário: ");
            salario = sc.nextDouble();

            if (salario < 3 * salarioMinimo) {
                reajuste = salario * 0.5;
            } else if (salario >= 3 * salarioMinimo && salario < 10 * salarioMinimo) {
                reajuste = salario * 0.2;
            } else if (salario >= 10 * salarioMinimo && salario < 20 * salarioMinimo) {
                reajuste = salario * 0.15;
            } else {
                reajuste = salario * 0.1;
            }

            novoSalario = salario + reajuste;
            totalReajuste += reajuste;

            System.out.println("Funcionário: " + nomeFuncionario);
            System.out.println("Reajuste: R$ " + reajuste);
            System.out.println("Novo salário: R$ " + novoSalario);
            System.out.println("-----------------------------");
        }

        System.out.println("Aumento total na folha de pagamento: R$ " + totalReajuste);

        sc.close();
    }
}
