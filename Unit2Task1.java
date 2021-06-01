public class Unit2Task1 {
    public static void main(String[] args) {
        int d = 1;
        double k = 10d;
        double j;
        double l;
        double sum = 0;
        for (d = 1; d < 8; d++) {
            System.out.print("день " + d + " ");

            l = (k / 10);
            sum += k;
            System.out.println("бежал " + k );

            k += l;
        }
        System.out.println("Сумма " + sum);

    }
}
