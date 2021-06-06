import java.util.Random;

public class Unit3Task11 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();

            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
            if(arr[i] > 0 & arr [i] % 3==0 )b++;
        }
        System.out.println();
        System.out.print(b);
    }
}