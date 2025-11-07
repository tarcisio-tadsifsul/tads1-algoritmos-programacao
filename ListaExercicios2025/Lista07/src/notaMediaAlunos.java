/**
 * 🏋️ Exercício de Algoritmo em Java: Análise de Notas
 * 
 * 🎯 Objetivo
 * Criar um programa que armazena notas de alunos em um vetor e, em seguida,
 * calcula a média da turma, encontra a maior nota e informa quantos alunos ficaram acima da média.
 * 
 * 📝 Requisitos
 * Crie um Array: Declare e inicialize um array de números decimais (double) com, no mínimo, 5 notas.
 * Calcule a Soma e Média: Percorra o array usando um loop for tradicional para somar todas as notas e, depois, calcule a média da turma.
 * Encontre a Maior Nota: Percorra o array novamente para encontrar e armazenar o valor da maior nota.
 * Conte os Aprovados: Percorra o array novamente, desta vez usando o loop for-each, para contar quantos alunos têm notas estritamente maiores que a média.
 * Imprima os Resultados: Exiba a lista de notas, a média, a maior nota e a contagem de alunos acima da média.
 * 
 */
import java.util.Scanner;
public class notaMediaAlunos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n --- ANÁLISE DE NOTAS --- \n");
        System.out.print("Informe a quantidade de alunos: ");
        int qtdAlunos = sc.nextInt();

        System.out.println("Agora, digite a nota de cada aluno");
        
        float[] notas = new float[qtdAlunos];
        float somaNotas = 0.0f;
        float maiorNota = 0.0f;

        for (int i = 0; i < qtdAlunos; i++){
            System.out.print("Nota do aluno #"+ (i+1) + ": ");
            notas[i] = sc.nextFloat();
            somaNotas += notas[i];
        }

        // Encontra a maior nota
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maiorNota){
                maiorNota = notas[i];
            }
        }

        // Calcula Média
        float mediaNotas = somaNotas / qtdAlunos;

        // Conta alunos acima da média
        int acimaMedia = 0;
        for (float nota : notas){
            acimaMedia += nota > mediaNotas ? 1 : 0;
        }

        System.out.println("Soma Notas: " + somaNotas);
        System.out.println("Média Notas: " + mediaNotas);
        System.out.println("Maior Nota: " + maiorNota);
        System.out.println("Maior ");

        sc.close();
    }
}
