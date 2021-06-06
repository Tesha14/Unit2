import java.util.Random;
import java.util.Scanner;

public class Unit3Task3 {
    public static void main(String[] args) {
        int o = 0;
        int mass[] = new int[15];
        for (int i =0; i < mass.length; i++) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            mass[i]=random.nextInt(10);
            System.out.print(" " + mass[i]);
            if (mass[i] > 0 & mass[i] % 2 == 0) o++;
        }

            System.out.println(" ");
            System.out.println("четных " + o);




        }
    }





