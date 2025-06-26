import java.util.Scanner;

public class resposta101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float compra = 0.0f, taxa = 0.0f, valor = 0.0f;
        System.out.print("Informe o valor da compra: ");
        compra = sc.nextFloat();
        sc.close();

        if (compra >= 4000) {
            taxa = 8.45 / 100; // Faltou 'f' no final dos valores
        } else if (compra >= 3000){
            taxa = 6.35 / 100; // Faltou 'f' no final dos valores
        } else if (compra >= 2000){
            taxa = 4.7 / 100; // Faltou 'f' no final dos valores
        } else if (compra >= 1000){
            taxa = 3.5 / 100; // Faltou 'f' no final dos valores
        }

        valor = compra * (1 - taxa);
        
        if (taxa > 0) {
            System.out.println("Valor Compra: " + compra);
            System.out.println("Taxa: " + taxa);
            System.out.println("Valor final com Desconto: " + valor);
        } else {
            System.out.println("Valor Final: " + valor);
        }
    }
}
