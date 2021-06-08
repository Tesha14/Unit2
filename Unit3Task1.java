public class Unit3Task1 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) a++;
        }
        int[] mass = new int[a];
        for (int i = 2, b = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                mass[b] = i;
                System.out.print(mass[b] + " ");
                b++;
                System.out.print(" ");
            }
        }
        System.out.println();
        {
            for (int p = 0; p < mass.length; p++)
                System.out.println(mass[p]);
        }
    }

}

