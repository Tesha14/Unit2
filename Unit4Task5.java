import java.util.Random;
import java.util.Scanner;

public class Unit4Task5 {
    public static void main(String[] args) {
        System.out.println("Ввести размер матрицы");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n;
        int a = 0;
        n = scanner.nextInt();
        int mass[][] = new int[n][n];
        for (int r = 0; r < n; r++) {
            for (int k = 0; k < n; k++) {
                mass[r][k] = random.nextInt(50);
                System.out.print(mass[r][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int massNew[][] = new int [mass.length][mass.length];
        for (int k = 0; k < mass.length; k++){
            for (int r = 0; r < mass.length; r++){
                massNew[k][r] = mass[r][k];
                System.out.print(massNew[k][r] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int r = 0; r < mass.length; r++){
            for (int k = 0; k < mass.length; k++){
                int change = mass[r][k];
                mass[r][k] = mass[k][r];
                mass[k][r] = change;
                System.out.print(mass[r][k] + " ");
            }
            System.out.println();
        }
    }
}
