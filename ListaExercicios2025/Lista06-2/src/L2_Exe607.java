/**
 * 
 * Construa um laço de repetição com while que solicite uma senha ao usuário
 * até que ele digite a senha correta ("tads1n").
 * 
 */
import java.util.Scanner;
public class L2_Exe607 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String enterSenha = "", senha = "tads1n";

        while (!enterSenha.equals(senha)) {
            System.out.print("Digite a senha: ");
            enterSenha = sc.nextLine();

            System.out.println("\nSENHA INCORRETA! TENTE NOVAMENTE.\n");
        }

        System.out.println("Senha CORRETA!");


        sc.close();

    }
}
