
import java.util.Scanner;

class S20220010240_strings {
    //concates using string.......
    public static String concat(String s) {
        s = s+" world";
        return s;
    }
    //concates using stringbuffer.................
    public static StringBuffer concat1(StringBuffer s1) {
        s1.append(" world");
        return s1;
    }
    //concates by stringbuilder.................
    public static StringBuilder concat2(StringBuilder s2) {
        s2.append(" world");
        return s2;
    }
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          String s1;
          System.out.println("enter the string:");
          s1 = input.nextLine();
          concat(s1);
          System.out.println("String :"+s1);
          //by using stringbuffer method
          StringBuffer s2 = new StringBuffer(s1);
          concat1(s2);
          System.out.println("StringBuilder:"+s2);
          StringBuilder s3 = new StringBuilder(s1);
          concat2(s3);
          System.out.println("StringBuffer :"+s3);
          input.close();
    }
}