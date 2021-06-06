import java.util.Random;
import java.util.Scanner;

public class Unit3Task0 {
    public static void main (String[] args){
        System.out.println("Вводим число");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n;
        int b = 0;
        n = scanner.nextInt();
        int mass[] = new int[n];
        for (int i = 0; i < n; i++) {
                mass[i] = random.nextInt(50);
                System.out.print(mass[i] + " ");
            }
            System.out.println();
            }
        }



