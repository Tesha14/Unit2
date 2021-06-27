import java.util.Random;
import java.util.Scanner;

public class Unit4Task4 {
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
        int sum = 0;
        boolean even = false;
        for (int r = 0; r < mass.length - 1; r++){
            for (int k = 0; k < mass.length -1; k++){
                if ((r < mass.length -1 -k) && mass[r][k] % 2 == 0){
                    even = true;
                    sum = sum + mass[r][k];
                    System.out.print(mass[r][k] + " ");
                }
            }
        }
        System.out.println();
        if (even) {
            System.out.print("Четные числа Sum над побочной дианагали = " + sum);
        } else {
            System.out.print("Четные числа над побочной диаганали нету ");
        }
    }
}
