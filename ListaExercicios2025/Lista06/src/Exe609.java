/**
 * Lista 06 - Exe609
 * Construa um laço de repetição com while que imprima
 * a seguinte sequência de coordenadas: (0,0) (0,1) (1,0) (1,1) (2,0) (2,1).
 */

public class Exe609 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("\nCoordenadas:");
        while (i < 6) {
            System.out.printf("(%d,%d) ", i/2, i%2);
            i++;
        }
        System.out.println("\n");
    }
}
