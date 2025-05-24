
/**
 * Lista Exercícios 4
 * 
 * Exercício 01
 * 
 * 1) Dados três valores, A, B, C, verificar se eles podem ser valores dos lados de um triângulo
 *    e, se forem, se é um triângulo escaleno, equilátero ou isósceles, considerando os seguintes conceitos:
 * 
 *      # Chama-se equilátero o triângulo que tem três lados iguais;
 *      # Denominam-se isósceles o triângulo que tem o comprimento de dois lados iguais;
 *      # Recebe o nome de escaleno o triângulo que tem os três lados diferentes.
 * 
 *    Lembre-se de que, para formar um triângulo, nenhum dos lados pode ser igual a zero e
 *    um lado não pode ser maior do que a soma dos outros dois.
 */

import java.util.Scanner;

public class Exe401 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Digite o valor do primeiro lado do triângulo: ");
        a = sc.nextInt();

        System.out.print("Digite o valor do segundo lado do triângulo: ");
        b = sc.nextInt();

        System.out.print("Digite o valor do terceiro lado do triângulo: ");
        c = sc.nextInt();

        sc.close();

        if ((a != 0) && (b != 0) && (c != 0)) { // verifica se não é igual a zero
            // Verifica se um lado é maior que os outros dois
            if (a > (b + c) || b > (a + c) || c > (a + b)) {
                System.out.println(
                        "\n Um dos lados é maior que a soma dos outros dois! Não é possível formar um triângulo. \n");
            } else {

                if (a == b && b == c) { // Verificar se é equilátero
                    System.out.println("Triângulo Equilátero!");
                } else if (a == b || b == c || c == a) { // Verificar se é isosceles
                    System.out.println("Triângulo Isósceles!");
                } else { // Caso falso nos teste anteriores, só pode ser escaleno
                    System.out.println("Triângulo Escaleno");
                }
            }
        } else {
            System.out.println("\n Um dos lados é igual a zero! Não é possível formar um triângulo. \n");
        }
    }
}
