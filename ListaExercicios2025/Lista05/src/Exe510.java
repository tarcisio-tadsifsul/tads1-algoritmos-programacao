
/**
 * Lista 05 - Switch
 * 
 * 10) Solicite ao usuário uma nota de 0 a 100. Utilizando `switch` (com `switch expressions`,
 * ou `if-else` dentro do `switch` para faixas) e classifique o desempenho em categorias como:
 *
 * 0-49: Insuficiente
 * 50-69: Regular
 * 70-89: Bom
 * 90-100: Excelente
 * 
 */
import java.util.Scanner;

public class Exe510 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota = 0f;
        int indexCat = 0;

        System.out.println("\n--- CLASSIFICAÇÃO DE DESEMPENHO ---");
        System.out.print("\nInforme a nota [0-100]: ");
        nota = sc.nextFloat();
        sc.close();

        if (nota < 0 || nota > 100) {
            System.out.println("A Nota deve ser na faixa de [0-100].\nEncerrando programa.");
            System.exit(0);
        } else {
            if (nota >= 90) {
                indexCat = 3;
            } else if (nota >= 70) {
                indexCat = 2;
            } else if (nota >= 50) {
                indexCat = 1;
            } else if (nota >= 0) {
                indexCat = 0;
            }
        }

        String categoria = switch (indexCat) {
            case 0 -> "Insuficiente";
            case 1 -> "Regular";
            case 2 -> "Bom";
            case 3 -> "Excelente";
            default -> "Categoria Indefinida";
        };

        System.out.println("\nClassificação da nota " + nota + ": " + categoria.toUpperCase());
    }
}
