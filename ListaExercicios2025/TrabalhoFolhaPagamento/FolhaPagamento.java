/**
 * Desenvolva na linguagem Java os cálculos para qualquer folha de pagamento conforme as REGRAS abaixo.

O programa deverá ler vários valores antes de calcular o salário bruto, após, conforme os descontos deve-se chegar ao valor correspondente ao salário líquido.

O programa terá a seguinte entrada de dados:

QUAL O SALÁRIO MENSAL(CALCULAR O SALÁRIO DIÁRIO E POR HORA)?

TÊM ADICIONAL DE:
PERICULOSIDADE (30%)?
INSALUBRIDADE (20% OU 40%)?
ADICIONAL NOTURNO (20% NA HORA), SE SIM, QUANTAS HORAS?
HORAS EXTRAS 50% (50% NA HORA), SE SIM, QUANTAS HORAS?
HORAS EXTRAS 100% (HORA DOBRADA), SE SIM, QUANTAS HORAS?
DOMINGOS (SALÁRIO/DIA DOBRADO), SE SIM, QUANTOS?
VALOR DAS VENDAS NO MÊS DA EMPRESA (APLICAR 3,85% DE COMISSÃO).
TEVE ADIANTAMENTO DE SALÁRIO (DEBITAR DO SALÁRIO BRUTO)?

AO FIM, SE TERÁ O VALOR BRUTO DO SALÁRIO.
*/

import java.util.Scanner;
public class FolhaPagamento {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float salario = 0.0f, salBruto = 0.0f, salLiquido = 0.0f;
        float peric = 0.0f, insalub = 0.0f, faltas = 0.0f;
        float adicNoturno = 0.0f, adicHE50 = 0.0f, adicHE100 = 0.0f, adicDom = 0.0f;
        float vendas = 0.0f, comissao = 0.0f, qtde = 0.0f;
        float aliqInss = 0.0f, inss = 0.0f, baseCalculo = 0.0f;
        float impRenda = 0.0f, aliqIR = 0.0f, parcDed = 0.0f;
        char possui;

        System.out.print("\n--- SISTEMA FOLHA DE PAGAMENTO ---\n");

        // SALARIO MENSAL
        System.out.print("\nQual o valor de salário mensal: ");
        salario = sc.nextFloat();
        // salDia = salario / 30f; 
        // salHora = salario / 220f;
        
        // PERICULOSIDADE
        System.out.print("\nPericulosidade? \n(S)im | (N)ão \nInforme: ");
        possui = sc.next().toLowerCase().charAt(0);
        if (possui == 's') {
            peric = salario * 0.3f;
            // pericDia = peric / 30f;
            // pericHora = peric / 220f;

            salBruto = salario + peric;
        }

        // INSALUBRIDADE
        System.out.print("\nInsalubridade? \n(S)im | (N)ão \nDigite opção: ");
        possui = sc.next().toLowerCase().charAt(0);
        if (possui == 's') {
            System.out.print("\nInsalubridade 20% ou 40%? \nInforme: ");
            float insalubPer = sc.nextFloat();
            if (insalubPer == 20) {
                insalubPer = 0.2f;
            } else if (insalubPer == 40){
                insalubPer = 0.4f;
            }
            insalub = salario * insalubPer;
            // insalubDia = insalub / 30f;
            // insalubHora = insalub / 220f;

            salBruto = salBruto + insalub;
        }

        // ADICIONAL NOTURNO
        System.out.print("\nAdicional noturno? \n(S)im | (N)ão \nDigite opção: ");
        possui = sc.next().toLowerCase().charAt(0);
        if (possui == 's') {
            System.out.print("\nQuantas horas? \nInforme: ");
            qtde = sc.nextFloat();
            adicNoturno = ((salario / 220f) + (peric / 220f) + (insalub / 220f)) * 1.2f * qtde;

            salBruto = salBruto + adicNoturno;
        }

        // ADICIONAL HORA EXTRA 50%
        System.out.print("\nAdicional HE50? \n(S)im | (N)ão \nDigite opção: ");
        possui = sc.next().toLowerCase().charAt(0);
        if (possui == 's') {
            System.out.print("\nQuantas horas? \nInforme: ");
            qtde = sc.nextFloat();
            adicHE50 = ((salario / 220f) + (peric / 220f) + (insalub / 220f)) * 1.5f * qtde;

            salBruto = salBruto + adicHE50;
        }

        // ADICIONAL HORA EXTRA 100%
        System.out.print("\nAdicional HE100? \n(S)im | (N)ão \nDigite opção: ");
        possui = sc.next().toLowerCase().charAt(0);
        if (possui == 's') {
            System.out.print("\nQuantas horas? \nInforme: ");
            qtde = sc.nextFloat();
            adicHE100 = ((salario / 220f) + (peric / 220f) + (insalub / 220f)) * 2.0f * qtde;

            salBruto = salBruto + adicHE100;
        }

        // ADICIONAL DOMINGO
        System.out.print("\nTrabalho algum domingo? \n(S)im | (N)ão \nDigite opção: ");
        possui = sc.next().toLowerCase().charAt(0);
        if (possui == 's') {
            System.out.print("\nQuantos? \nInforme: ");
            qtde = sc.nextFloat();
            adicDom = ((salario / 30f) + (peric / 30f) + (insalub / 30f)) * 2.0f * qtde;

            salBruto = salBruto + adicDom;
        }

        // ADIANTAMENTO DE SALARIO
        System.out.print("\nTem adiantamento de salário? \n(S)im | (N)ão \nDigite opção: ");
        possui = sc.next().toLowerCase().charAt(0);
        if (possui == 's') {
            System.out.print("\nQual o valor de adiantamento? \nInforme: ");
            float adiantamento = sc.nextFloat();

            salBruto = salBruto - adiantamento;
        }

        // DESCONTOS: FALTAS
        System.out.print("\nPossui faltas? \n(S)im | (N)ão \nDigite opção: ");
        possui = sc.next().toLowerCase().charAt(0);
        if (possui == 's') {
            System.out.print("\nQuantas faltas? \nInforme: ");
            qtde = sc.nextFloat();
            faltas = ((salario / 30f) + (peric / 30f) + (insalub / 30f)) * 2f * qtde;
        }
        
        // FATURAMENTO
        System.out.print("\nQual o valor vendas mensal? \nInforme: R$ ");
        vendas = sc.nextFloat();
        comissao = vendas * 0.0385f;
        salBruto = salBruto + comissao;
        
        sc.close();

        // DESCONTOS: INSS
        if (salBruto <= 1518.00) {
            aliqInss = 0.075f;
        } else if (salBruto <= 2793.88){
            aliqInss = 0.09f;
        } else if (salBruto <= 4190.83){
            aliqInss = 0.12f;
        } else {
            aliqInss = 0.14f;
        }

        inss = salBruto * aliqInss;
        baseCalculo = salBruto - inss;

        // DESCONTOS: IMPOSTO RENDA
        if (baseCalculo <= 2428.80) {
            aliqIR = 0.0f;
            parcDed = 0;
        } else if (baseCalculo <= 2826.65){
            aliqIR = 0.075f;
            parcDed = 182.16f;
        } else if (baseCalculo <= 3751.05){
            aliqIR = 0.15f;
            parcDed = 394.16f;
        } else if (baseCalculo <= 4664.68){
            aliqIR = 0.225f;
            parcDed = 675.49f;
        } else if (baseCalculo > 4664.68){
            aliqIR = 0.275f;
            parcDed = 908.73f;
        }

        impRenda = (baseCalculo * aliqIR) - parcDed;

        salLiquido = salBruto - inss - impRenda - faltas;


        System.out.println("\nCONTRA-CHEQUE ------------------------");
        System.out.println("\nSalário em carteira: R$ " + salario);
        System.out.println("---------------------------------------");
        if (peric > 0 ) {
            System.out.println("Adicional Periculosidade: R$ " + peric);
        }
        if (insalub > 0){
            System.out.println("Adicional Insalubridade: R$ " + insalub);
        }
        if(adicNoturno > 0){
            System.out.println("Adicional Noturno: R$ " + adicNoturno);
        }
        if(adicHE50 > 0){
            System.out.println("Adicional Hora Extra 50%: R$ " + adicHE50);
        }
        if(adicHE100 > 0){
            System.out.println("Adicional Hora Extra 100%: R$ " + adicHE100);
        }
        if(adicDom > 0){
            System.out.println("Adicional Domingo trabalhado: R$ " + adicDom);
        }
        if(comissao > 0){
            System.out.println("Valor Comissao: R$ " + comissao);
        }

        System.out.println("\n---------------------------------------");
        System.out.println("\nSalário bruto: " + salBruto);
        
        System.out.println("\n---------------------------------------");
        System.out.println("Valor Desconto INSS: R$ " + inss);
        System.out.println("Valor Desconto IR: R$ " + impRenda);
        System.out.println("Valor Desconto Faltas: R$ " + faltas);

        System.out.println("\n---------------------------------------");
        System.out.println("Valor Salário Líquido: R$ " + salLiquido);
        System.out.println("---------------------------------------");
        
    }
}
