

class Box {
    private double width;
    private double height;
    private double depth;

    Box(double w,double h,double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        return width*height*depth;
    }
}
class Boxweight extends Box {
    double weight;
    Boxweight(double w,double h,double d,double m) {
        super(w,h,d);
        weight = m;
    }
}
class DemoBoxweight {
    public static void main(String[] args) {
        Boxweight box1 = new Boxweight(10,20,30,40);
        double vol;
        vol = box1.volume();
        System.out.println("volume of box1 is " +vol);
        System.out.println("weight of box1 is" +box1.weight);
    }
}
