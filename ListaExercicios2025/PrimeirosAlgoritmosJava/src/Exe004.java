/**
 * Segunda aula de Algoritmo e Programação
 * Aprendendo os primeiros comandos da IDE BlueJ
 * 
 * Exercício 03
 * Crie um algoritmo para calcular a fórmula de baskara
 * x = -b ± √(b² - 4ac)/2
 */

// Import da classe Scanner
import java.util.Scanner;

public class Exe004 {
    public static void main(String[] args) {
        // Cria o objeto entrada a partir da classe Scanner
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.println("--------------------------");
        System.out.println("Informe o valor de a na equaçao: ");
        int a = entrada.nextInt();
        System.out.println("Informe o valor de b na equaçao: ");
        int b = entrada.nextInt();
        System.out.println("Informe o valor de c na equaçao: ");
        int c = entrada.nextInt();

        // Encerra objeto da classe Scanner
        entrada.close();

        System.out.println("--------------------------");
        System.out.println("Equaçao: " + a + "x²" + " + " + b + "x + " + c + " = 0");

        // Declaraçao de variavel
        // e atribuiçao do calculo de Delta
        double delta = Math.pow(b, 2) - (4 * a * c);

        // Condicional de Delta < 0
        if (delta < 0) {
            // Se condiçao true, printa msg na tela
            // E finaliza metodo main
            System.out.println("Delta < 0");
            System.out.println("Equação não tem solução");
            System.out.println("no conjunto dos números reais!");
            System.out.println("--- Fim ---");
            return;
        }

        // Declaraçao variaveis x1 e x2
        double x1;
        double x2;

        // Atribuiçao de calculo as variaveis x1 e x2
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        // Printa na tela resultado
        System.out.printf("x₁ = %.2f\n", x1);
        System.out.printf("x₂ = %.2f\n", x2);
        System.out.println("--- Fim ---");
    }
}
