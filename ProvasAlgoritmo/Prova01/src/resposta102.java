import java.util.Scanner;

public class resposta102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float cap = 0.0f, tx = 0.0f, juro = 0.0f, mont = 0.0f;
        int tempo, op;
        String head;
        
        System.out.println("Deseja calcula Juros: [1] Simples ou [2] Composto?");
        op = sc.nextInt();
        System.out.print("Capital: ");
        cap = sc.nextFloat();
        System.out.print("Taxa: ");
        tx = sc.nextFloat();
        System.out.print("Tempo: ");
        tempo = sc.nextInt();
        sc.close();

        if (op == 1) {
            mont = cap * (tx*100) * tempo;
            // A fórmula acima retorna apenas os juros;
            // Fórmula correta para montante com juros: M = C + (C * i * t) 
            head = "Juros Simples";
        } else {
            mont = cap * Math.pow(1 + (tx/100), tempo); // mont deve ser double
            // Correção: como o retorno de Math.pow retorna double,
            // é recomendado declarar a var mont como double
            head = "Juros Compostos";
        }

        System.out.println("Resultado com " + head);
        System.out.println("Capital Inicial: " + cap);
        System.out.println("Taxa de Juros Mensal: " + tx + "%");

        juro = mont - cap;
        // Esse fórmula só funciona se o montante já é conhecido
        // O Correto para achar o montante é M = J + C
        // Esse calculo deveria esta mais para cima

        System.out.println("tempo: " + tempo);
        System.out.println("Juros: " + juro);
        System.out.println("Montante: " + mont);

    }
}
