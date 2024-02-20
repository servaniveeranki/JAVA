class Box {

    private double width;

    private double height;

    private double depth;

    Box(double w, double h, double d) {

        width = w;

        height = h;

        depth = d;

    }

    double volume() {

        return width * height * depth;
    }

}

class BoxWeight extends Box {

    double weight;

    BoxWeight(double w, double h,
            double d, double m) {

        super(w, h, d);

        weight = m;

    }

}

class DemoBoxWeight {

    public static void main(String args[]) {

        BoxWeight box1 =

                new BoxWeight(10, 20, 15, 10);

        double vol;

        vol = box1.volume();

        System.out.println("Volume of box1 is " + vol);

        System.out.println("Weight of box1 is " + box1.weight);

    }

}