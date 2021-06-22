public class Unit8Task2 {
    public static void main(String[] args){
        String test = "I can't imagine so beautiful think";
        StringBuffer stringBuffer = new StringBuffer("I can't imagine so beautiful think");
        char c = stringBuffer.charAt(3);
        System.out.println(c);
        stringBuffer.setCharAt(3, 'I');
        // System.out.println(stringBuffer.toString());
        System.out.println(test.replace("a", "I"));
    }
}
