
/**
 * Lista Exercícios 4
 * 
 * Exercício 05
 * 
 * 5) Faça um programa que calcule as raízes de uma equação do segundo grau,
 * na forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e
 * fazer as consistências, informando ao usuário nas seguintes situações:
 *  
 *  a. Se o usuário informar o valor de A igual a zero, a equação
 *     não é do segundo grau e o programa não deve pedir os demais valores,
 *     sendo encerrado;
 *  
 *  b. Se o delta calculado for negativo, a equação não possui raízes reais.
 *     Informe ao usuário e encerre o programa;
 * 
 *  c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real.
 *     Informe ao usuário o valor de x1;
 * 
 *  d. Se o delta for positivo, a equação possui duas raízes reais;
 *     Informe ao usuário o valor de x1 e x2.
 * 
 *  Δ = b² - 4.a.c
 *  x = (-b ± √Δ ) / 2.a
 * 
 */

import java.util.Scanner;

public class Exe405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double delta, x1, x2;

        System.out.println("--- CALCULADORA DE BASKARA ---");
        System.out.print("Informe o valor de a: ");
        a = sc.nextInt();
        if (a == 0) {
            System.out.println("Coeficinente a = 0, a equação não é do segundo grau. Encerrando programa.");
            sc.close();
            return;
        }

        System.out.print("Informe o valor de b: ");
        b = sc.nextInt();
        System.out.print("Informe o valor de c: ");
        c = sc.nextInt();
        sc.close();

        System.out.print("\nDelta = b² - 4.a.c \n");
        System.out.printf("Delta = (%d²) - 4.%d.%d \n", b, a, c);

        delta = (Math.pow(b, 2)) - (4 * a * c);
        System.out.println("Delta = " + delta);

        if (delta < 0) {
            System.out.println("Delta < 0, a equação não possui raízes reais!");
            return;

        } else if (delta == 0) {
            x1 = (-(b) + (Math.sqrt(delta))) / (2 * a);
            System.out.println("\nx = -b ± raizQ(delta) / 2.a");
            System.out.printf("x1 = %.2f", x1);

        } else if (delta > 0) {
            x1 = (-(b) + (Math.sqrt(delta))) / (2 * a);
            x2 = (-(b) - (Math.sqrt(delta))) / (2 * a);
            System.out.println("\nx = -b ± raizQ(delta) / 2.a");
            System.out.printf("x1 = %.2f \n", x1);
            System.out.printf("x1 = %.2f \n", x2);

        } else {
            System.out.println("Encerrando programa.");
            return;
        }
    }
}
