import java.util.Scanner;
public class Questao101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float compra = 0.00f, desc = 0.00f, valorFinal = 0.00f;

        System.out.print("Informe o valor da Compra: ");
        compra = sc.nextFloat();
        sc.close();

        if (compra >= 4000) {
            desc = 8.45f;
        } else if (compra >= 3000) {
            desc = 6.35f;
        } else if (compra >= 2000) {
            desc = 4.70f;
        } else if (compra >= 1000) {
            desc = 3.50f;
        }

        valorFinal = compra * (1 - (desc / 100));
        
        if (desc > 0) {
            System.out.printf("\nValor da Compra: R$%.2f", compra);
            System.out.printf("\nValor do Desconto: %.2f%%", desc);
        }
        System.out.printf("\nValor da Final da Compra: R$%.2f \n", valorFinal);
    }
}
