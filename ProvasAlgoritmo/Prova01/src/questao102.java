import java.util.Scanner;
public class questao102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float c = 0.00f, i = 0.00f;
        double m = 0.00, j = 0.00;
        int op = 0, t = 0;

        System.out.println("\n--- CÁLCULO DE APLICAÇÃO ---");
        System.out.print("\nInforme o valor do capital da aplicação: ");
        c = sc.nextFloat();
        System.out.print("Informe a taxa de juros da aplicação: ");
        i = sc.nextFloat();
        System.out.print("Informe o tempo em meses da aplicação: ");
        t = sc.nextInt();
        System.out.println("\nVocê que calcular Juros Simples ou Composto?");
        System.out.println("[1] Juros Simples \n[2] Juros Compostos");
        System.out.print("\nInforme uma opção: ");
        op = sc.nextInt();
        sc.close();

        if (op == 1) {
            m = c * (1 + (i/100) * t);
            System.out.println("\nResultado com Juros Simples:");
        } else if (op == 2){
            m = c * ( Math.pow(1 + (i/100), t) );
            System.out.println("\nResultado com Juros Composto:");
        } else {
            System.out.println("Opção Inválida. Encerrando programa!");
            return;
        }

        j = m - c;

        System.out.printf("\nCapital Inicial: R$%.2f", c);
        System.out.printf("\nTaxa Juros Mensal: %.2f%%", i);
        System.out.printf("\nTempo: %d", t);
        System.out.printf("\nJuros: R$%.2f", j);
        System.out.printf("\nMontante Final: R$%.2f", m);

    }
}
