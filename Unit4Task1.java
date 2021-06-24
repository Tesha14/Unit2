import java.util.Random;
import java.util.Scanner;

public class Unit4Task1 {
    public static void main(String[] args) {
        System.out.println("Вводим размер матрицы");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n;
        int b = 0;
        n = scanner.nextInt();
        int mass[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = random.nextInt(50);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        int s = 0;
        for(int i=0; i<mass.length; ++i){
            for(int j=0; j<mass[i].length; ++j){
                if(i == j){
                    s += mass[i][j];
                }
            }
        }
        System.out.println(s);
    }
}