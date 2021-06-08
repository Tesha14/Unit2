import java.util.Random;

public class Unit3Task14 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int o = 0; o < arr.length; o++) {
            Random random = new Random();

            arr[o] = random.nextInt(10);
            System.out.print(arr[o] + " ");
        }

        int min = arr[0];

        for (int o = 0; o < arr.length; o++) {
            if (arr[o] % 2 != 0 && arr[o] < min || min == 0) {
                min = arr[o];
            }
        }
        System.out.println();
        System.out.println("минимальное нечётное число " + min);
    }
}