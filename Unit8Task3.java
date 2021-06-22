public class Unit8Task3 {
    public static void main(String[] args) {
        String test1 = "dude earns everyday deciding";
        System.out.println("dude" + "\n" + "earns" + "\n" + "everyday" +
                "\n" + "deciding");
        StringBuffer strBuffer = new StringBuffer("dude earns everyday deciding");
        String str1 = strBuffer.substring(2, 4);
        String str2 = strBuffer.substring(11, 12);
        String str3 = strBuffer.substring(16, 17);
        System.out.print(str1 + str2 + str3);
    }
}