import java.util.Random;

public class Unit3Task20 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();

            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        int max = arr[0];
        int temp = arr[0];
        arr[0] = arr[max];
        arr[max] = temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i] = 0;
            }


        }
        System.out.println();
        System.out.print(max);
    }
}
