import java.util.Random;
import java.util.Scanner;

public class Unit4Task3 {
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
        int m1 = 1;
        int m2 = 1;
        for (int r = 0; r < mass.length; r++){
            for (int k =0; k < mass.length; k++){
                if (r == k){
                    m1 = m1 * mass[r][k];
                }
                if (k == mass.length -1 -r){
                    m2 = m2 * mass[r][k];
                }
            }
        }
        System.out.println("Элементы диаганали m1 = " + m1);
        System.out.println("Элементы диаганали m2 =" + m2);
        if (m1 > m2){
            System.out.println("m1 больше = " + m1);
        } else {
            System.out.println("m2 больше = " + m2);
        }
    }
}
