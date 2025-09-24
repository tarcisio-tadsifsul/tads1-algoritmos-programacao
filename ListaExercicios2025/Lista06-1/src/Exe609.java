/**
 * Lista 06 - Exe609
 * Construa um laço de repetição com while que imprima
 * a seguinte sequência de coordenadas: (0,0) (0,1) (1,0) (1,1) (2,0) (2,1).
 */

public class Exe609 {
    public static void main(String[] args) {
        byte i = 0;
        System.out.println("\nCoordenadas:");
        while (i < 6) {
            System.out.printf("(%d,%d) ", i/2, i%2);
            i++;
        }
        System.out.println("\n");
    }
}

// Forma com while dentro de while
/* int x = 0, y = 0;
        System.out.println("\nCoordenadas:");
        while (x <= 2) {
            y = 0;
            while (y < 2) {
                System.out.print("("+ x +","+ y +") ");
                y++;
            }
            x++;
        }
        System.out.println("\n"); */