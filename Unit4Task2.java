import java.util.Random;
import java.util.Scanner;

public class Unit4Task2 {
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
        System.out.println("odd elements under the main diagonal");
        boolean odd = false;

        int j = 0;
        for (int r = 0; r < mass.length; r++) {
            for (int k = 0; k < mass.length - 1; k++) {
                if (mass[r][k] % 2 != 0 && r > k) {
                    odd = true;
                    System.out.print(+mass[r][k] + " ");
                }
            }
        }
        if (odd == false) {
            System.out.println("do not exist");
        }
    }
}