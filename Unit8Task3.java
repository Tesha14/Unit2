public class Unit8Task3 {
    public static void main(String[] args) {
        String test1 = "deed earns everyday deciding";
        System.out.println("deed" + "\n" + "earns" + "\n" + "everyday" +
                "\n" + "deciding");
        String array[] = test1.split("\n");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < args.length; i++) {
            StringBuffer strBuffer = new StringBuffer(array[i]);
            if (array[i].equals(strBuffer.reverse().toString())) {
                System.out.println(array[i]);
            }
        }
    }
}