
/**
 * Lista Exercícios 4
 * 
 * Exercício 02
 * 
 * 2) Escreva um algoritmo em Java em que o usuário escolhe se ele quer comprar
 *    maçãs, laranjas ou peras. Deverá ser apresentado na tela um menu
 *    com as opções: 1 para maçã, 2 para laranja e 3 para pera.
 * 
 *    Caso o cliente digite qualquer outra opção: “Produto inexistente”
 *    deverá aparecer na tela e encerrar o programa.
 * 
 *    Após escolhida a fruta, deve-se ler quantos quilos (ex. 1,60) se quer comprar.
 *    O algoritmo deve calcular o preço total a pagar do produto escolhido
 *    e mostrá-lo na tela.
 * 
 *    Considere que o quilo da maçã custa R$ 9,30, laranja R$ 12,60 e da pera 5,85.
 */

import java.util.Scanner;

public class Exe402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menuFrutas;
        float valorKg = 0.0f, qtdFruta, totalPagar = 0.0f;

        System.out.print("\n --- FRUTEIRA --- \n");
        System.out.print("Escolha a fruta: \n [1] Maças \n [2] Laranjas \n [3] Peras \n\n");
        System.out.print("Digite uma das opções: ");
        menuFrutas = sc.nextInt();
        if (menuFrutas == 1) {
            valorKg = 9.30f;
        } else if (menuFrutas == 2) {
            valorKg = 12.60f;
        } else if (menuFrutas == 3) {
            valorKg = 5.85f;
        } else {
            System.out.println("Opção inválida! Encerrando programa.");
            sc.close();
            return;
        }

        System.out.print("Quantos quilos você quer? ");
        qtdFruta = sc.nextFloat();
        if (qtdFruta > 0) {
            totalPagar = qtdFruta * valorKg;
        } else {
            System.out.println("Quantidade inválida! Encerrando programa.");
            sc.close();
            return;
        }

        System.out.printf("Total a Pagar: R$%.2f", totalPagar);

        sc.close();
    }
}
