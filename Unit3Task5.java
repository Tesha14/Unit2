import java.util.Random;
import java.util.Scanner;

public class Unit3Task5 {
    public static void main(String[] args) {

        int mass[] = new int[5];
        int mass2[] = new int[5];
        int result = 0;
        for (int i = 0; i < mass.length; i++) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            mass[i] = random.nextInt(15);
            System.out.print(mass[i] + " ");
            for (int d : mass) {
                result += d;
            }

        }
        System.out.println("Среднее арифметическое " + result / mass.length);
        System.out.println();
        for (int j = 0; j < mass.length; j++) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            mass2[j] = random.nextInt(15);
            System.out.print(mass2[j] + " ");
            for (int s : mass2) {
                result += s;
            }
        }
        System.out.println("Среднее арифметическое " + result / mass.length); // небывалые рандомы(

    }
}
