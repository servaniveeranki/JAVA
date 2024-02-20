import java.lang.Math;
import java.util.Scanner;

public class Geometry {
    public static double cube_volume(double h) {
        return h * h * h;
    }

    public static double cube_surface(double h) {
        return 6 * h * h;
    }

    public static double sphere_volume(double r) {
        return (4.0 / 3) * Math.PI * Math.pow(r, 3);
    }

    public static double sphere_surface(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double cylinder_volume(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    public static double cylinder_surface(double r, double h) {
        return 2 * Math.PI * r * (r + h);
    }

    public static double cone_volume(double r, double h) {
        return (1.0 / 3) * Math.PI * Math.pow(r, 2) * h;
    }

    public static double cone_surface(double r, double h) {
        double slantHeight = Math.sqrt(r * r + h * h);
        return Math.PI * r * (r + slantHeight);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius (r): ");
        double radius = input.nextDouble();

        System.out.print("Enter height (h): ");
        double height = input.nextDouble();

        input.close();

        System.out.println("Cube Volume: " + cube_volume(height));
        System.out.println("Cube Surface Area: " + cube_surface(height));
        System.out.println("Sphere Volume: " + sphere_volume(radius));
        System.out.println("Sphere Surface Area: " + sphere_surface(radius));
        System.out.println("Cylinder Volume: " + cylinder_volume(radius, height));
        System.out.println("Cylinder Surface Area: " + cylinder_surface(radius, height));
        System.out.println("Cone Volume: " + cone_volume(radius, height));
        System.out.println("Cone Surface Area: " + cone_surface(radius, height));
    }
}
