public class Unit8Task1 {
    public static void main (String[]args){
        String test = "I can't imagine so beautiful think";
        String test1 = "dude earns everyday deciding";
        StringBuffer stringBuffer = new StringBuffer("I can't imagine so beautiful think");
        int startIndex = 8;
        int endIndex = 15;
        char[] buffer = new char[endIndex-startIndex];
        stringBuffer.getChars(startIndex, endIndex, buffer, 0);
        System.out.println(buffer);
      // System.out.println(test.substring(0, 34 ));



    }
}
