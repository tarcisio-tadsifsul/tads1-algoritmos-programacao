
/**
 * Lista Exercícios 4
 * 
 * Exercício 04
 * 
 * 4) A empresa XYZ concedeu um bônus de 20% para todos seus funcionários
 * com mais de 5 anos de empresa. E todos os outros receberam uma bonificação de 10%.
 * 
 * Vamos inserir mais uma camada de restrição neste exercício.
 * Agora, além dos critérios acima, funcionários com mais de 10 anos de empresa
 * têm direito a uma bonificação de 30%.
 * 
 * Neste caso, temos agora 3 possíveis resultados de bonificação: 30%, 20% e 10%.
 * 
 * Desenvolva este algoritmo e imprima o resultado correto na tela.
 *  
 *  Menos  5  anos - 10%;
 *  Mais   5  anos - 20%;
 *  Mais   10 anos - 30
 */

import java.util.Scanner;

public class Exe404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anosEmpresa;
        float salario, percBonus, valorBonus;

        System.out.print("Quantos anos de empresa o funcionário possui: ");
        anosEmpresa = sc.nextInt();
        System.out.print("Qual o salário do funcionário: R$ ");
        salario = sc.nextFloat();

        sc.close();

        if (anosEmpresa > 10) {
            percBonus = 0.3f;
            valorBonus = salario * percBonus;
        } else if (anosEmpresa > 5) {
            percBonus = 0.2f;
            valorBonus = salario * percBonus;
        } else {
            percBonus = 0.1f;
            valorBonus = salario * percBonus;
        }

        System.out.printf("Salario + Bonificação  = R$%.2f", salario + valorBonus);
    }
}
