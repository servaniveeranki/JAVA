
import  java.lang.Math.*;

public class Mathop

{

    // private static final double PI = 0;

    public double circle(double r) {

        double area = Math.PI * r * r;
        return area;

    }

    public static void main(String args[]) {

        Mathop obj = new Mathop();
        double f;

        f = obj.circle(2.3);
        System.out.printf("AREA:%f\n", f);
    }

}