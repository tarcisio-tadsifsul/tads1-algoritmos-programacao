import java.util.Scanner;
public class medioNota {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        float nota = 0.0f, acc = 0.0f, media = 0.0f;
        while (i <= 5) {
            
            System.out.print("Digite uma nota #"+ i + ": ");
            nota = sc.nextInt();

            acc = acc + nota;
            i++;
        }
        sc.close();

        media = acc / 5;
        System.out.println("Média = " + media);
    }
}
