public class Unit8Task1 {
    public static void main (String[]args){
        String test = "I can't imagine so beautiful think";
        String test1 = "dude earns everyday deciding";
        StringBuffer stringBuffer = new StringBuffer("I can't imagine so beautiful think");
        int startIndex = 9;
        int endIndex = 15;
        char[] buffer = new char[endIndex-startIndex];
        stringBuffer.getChars(startIndex, endIndex, buffer, 0);
        System.out.println(buffer);
      // System.out.println(test.substring(0, 34 ));
        char c = stringBuffer.charAt(3);
        System.out.println(c);
        stringBuffer.setCharAt(3, 'I');
       // System.out.println(stringBuffer.toString());
       System.out.println(test.replace("a", "I"));
       System.out.println("dude" + "\n" + "earns" + "\n" + "everyday" +
               "\n" + "deciding");
        StringBuffer strBuffer = new StringBuffer("dude earns everyday deciding");
        String str1 = strBuffer.substring(2,4);
        String str2 = strBuffer.substring(11,12);
        String str3 = strBuffer.substring(16,17);
        System.out.print(str1+str2+str3);



    }
}
