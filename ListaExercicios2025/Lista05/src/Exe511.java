
/**
 * Lista 05 - Switch
 * 
 * 11) Crie um jogo simples de "Pedra, Papel, Tesoura" contra o computador.
 * O usuário escolhe uma opção (1 para Pedra, 2 para Papel, 3 para Tesoura)
 * e o computador gera uma escolha aleatória. Utilize `switch` para determinar o vencedor.
 * 
 */
import java.util.Scanner;

public class Exe511 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userMov, compMov;

        System.out.println("\n--- PEDRA, PAPEL E TESOURA ---");
        System.out.print("\nEscolha o primeiro movimento:"
                + "\n [1] Pedra"
                + "\n [2] Papel"
                + "\n [3] Tesoura"
                + "\n\n Escolha uma opção: ");
        userMov = sc.nextInt();
        sc.close();

        // Gera movimento aleatório do computador
        compMov = (int) (Math.random() * (4 - 1)) + 1;

        // Verificar o movimento do usuário
        switch (userMov) {
            case 1:
                System.out.println("\nVocê escolheu PEDRA.");
                // Verificar o movimento do computador
                switch (compMov) {
                    case 1:
                        System.out.println("Computador escolheu PEDRA");
                        System.out.println("Resultado: EMPATE!");
                        break;
                    case 2:
                        System.out.println("Computador escolheu PAPEL");
                        System.out.println("PAPEL embrulha PEDRA");
                        System.out.println("Resultado: Computador Venceu!");
                        break;
                    case 3:
                        System.out.println("Computador escolheu TESOURA");
                        System.out.println("PEDRA esmaga TESOURA");
                        System.out.println("Resultado: Você Venceu!");
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("\nVocê escolheu PAPEL!");
                switch (compMov) {
                    case 1:
                        System.out.println("Computador escolheu PEDRA");
                        System.out.println("PAPEL embrulha PEDRA");
                        System.out.println("Resultado: Você Venceu!");
                        break;
                    case 2:
                        System.out.println("Computador escolheu PAPEL");
                        System.out.println("Resultado: EMPATE!");
                        break;
                    case 3:
                        System.out.println("Computador escolheu TESOURA");
                        System.out.println("TESOURA corta PAPEL");
                        System.out.println("Resultado: Computador Venceu!");
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                System.out.println("\nVocê escolheu TESOURA!");
                switch (compMov) {
                    case 1:
                        System.out.println("Computador escolheu PEDRA");
                        System.out.println("PEDRA esmaga TESOURA");
                        System.out.println("Resultado: Computador Venceu!");
                        break;
                    case 2:
                        System.out.println("Computador escolheu PAPEL");
                        System.out.println("TESOURA corta PAPEL");
                        System.out.println("Resultado: Você Venceu!");
                        break;
                    case 3:
                        System.out.println("Computador escolheu TESOURA");
                        System.out.println("Resultado: EMPATE!");
                        break;
                    default:
                        break;
                }
                break;
            default:
                System.out.println("\nEscolha Inválida!");
                break;
        }
    }
}
