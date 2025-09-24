
import java.util.Scanner;
public class L2_Exe605 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        int numCaracteres = frase.length();

        System.out.println(numCaracteres);
    }
}
