import java.util.Random;
import java.util.Scanner;

public class Unit3Task5 {
    public static void main(String[] args) {

        double mass[] = new double[5];
        double mass2[] = new double[5];
        double result = 0;
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(15);
            System.out.print(mass[i] + " ");
            for (double d : mass) {
                result += d;
            }

        }
        System.out.println("Среднее арифметическое " + result / mass.length);
        System.out.println();
         double mass3[];

        for (int j = 0; j < mass.length; j++) {
            mass2[j] = random.nextInt(15);
            System.out.print(mass2[j] + " ");
            for (double s : mass2) {
                result += s;
            }
        }
        System.out.println("Среднее арифметическое " + result / mass2.length); // небывалые рандомы(

    }
}
