import java.util.Scanner;

public class resposta103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3, mediaA, mediaP;


        System.out.print("informe a nota da avaliação #1: ");
        n1 = sc.nextFloat();
        System.out.print("informe a nota da avaliação #2: ");
        n2 = sc.nextFloat();
        System.out.print("informe a nota da avaliação #3: ");
        n3 = sc.nextFloat();
        sc.close();

        mediaA = (n1 + n2 + n3) / 3;
        mediaP = ((n1 * 2.5) + (n2 * 3.5) + (n3 * 4)) / (2.5 + 3.5 + 4);
        // Use sufixo f nos números decimais para forçar o tipo float
        // mediaP = ((n1 * 2.5f) + (n2 * 3.5f) + (n3 * 4f)) / (2.5f + 3.5f + 4f);

        System.out.println("Média Aritmética: " + mediaA);
        System.out.println("Média Ponderada: " + mediaP);
    }
}
