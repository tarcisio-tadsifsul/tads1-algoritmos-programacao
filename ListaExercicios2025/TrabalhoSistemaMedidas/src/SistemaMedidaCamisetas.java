
/**
 * 1. Desenvolva um pequeno sistema que leia o sexo de uma pessoa: M ou F e logo após
 * leia a largura (cm) e a altura (cm), para a confecção de uma camisa polo de nossa Instituição.
 * Siga as informações abaixo:
 * 
 * Camisa Polo Masculina:
 * Tamanho   Largura (cm)   Comprimento (cm)
 * | P       | 54           | 68
 * | M       | 56           | 70
 * | G       | 58           | 72
 * | GG      | 60           | 75
 * | EXG     | 62           | 78
 * | G1      | 66           | 81
 * | G2      | 68           | 83
 * | G3      | 70           | 85
 *
 * Camisa Polo Feminina:
 * Tamanho   Largura (cm)   Comprimento (cm)
 * | P       | 44           | 60
 * | M       | 46           | 62
 * | G       | 48           | 64
 * | GG      | 50           | 66
 * | EXG     | 52           | 68
 * 
 * Você deve guardar os tamanhos das camisas dentro de dois vetores:
 * String masculino[8] e String feminino[5].
 * Conforme a estrutura de decisão encontrar o tamanho da camisa
 * a posição do vetor correspondente deve ser mostrada.
 */

import java.util.Scanner;

public class SistemaMedidaCamisetas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variáveis
        char s;
        float largura, comprimento;

        // Tabelas de tamanhos
        String[] tamMasc = { "P", "M", "G", "GG", "EXG", "G1", "G2", "G3" };
        String[] tamFem = { "P", "M", "G", "GG", "EXG" };

        // Larguras por tamanho
        int[] largMasc = { 54, 56, 58, 60, 62, 66, 68, 70 };
        int[] largFem = { 44, 46, 48, 50, 52 };

        System.out.println("\n--- SISTEMA DE MEDIDAS ---");
        System.out.println("| Informe seus dados para confecção da Camiseta\n");

        // Entrada do sexo
        System.out.println("| Qual o gênero da confecção?");
        System.out.println("| [M] Masculino");
        System.out.println("| [F] Feminino");
        System.out.print("| Digite: ");
        s = sc.next().toLowerCase().charAt(0);

        // Entrada das medidas
        System.out.println("\n| Informe suas medidas em centímetros:");
        System.out.print("| Largura: ");
        largura = sc.nextFloat();

        System.out.print("| Comprimento: ");
        comprimento = sc.nextFloat();

        System.out.println();

        // -------- MASCULINO --------
        if (s == 'm') {

            // Verifica se está fora da faixa
            if (largura < largMasc[0] || largura > largMasc[largMasc.length - 1]) {
                System.out.println("[AVISO] Medida de largura indisponível!");
            } else {

                // Percorre do maior para o menor
                for (int i = largMasc.length - 1; i >= 0; i--) {
                    if (largura >= largMasc[i]) {
                        System.out.println("Para suas medidas, o tamanho indicado é: " + tamMasc[i]);
                        break;
                    }
                }
            }

        }
        // -------- FEMININO --------
        else if (s == 'f') {

            if (largura < largFem[0] || largura > largFem[largFem.length - 1]) {
                System.out.println("[AVISO] Medida de largura indisponível!");
            } else {

                for (int i = largFem.length - 1; i >= 0; i--) {
                    if (largura >= largFem[i]) {
                        System.out.println("Para suas medidas, o tamanho indicado é: " + tamFem[i]);
                        break;
                    }
                }

            }

        }
        // Sexo inválido
        else {
            System.out.println("[ERRO] Informe 'M' ou 'F' para gênero!");
        }

        sc.close();
    }
}
