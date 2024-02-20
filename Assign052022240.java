
import java.util.Random;

public class Assign052022240 {
    public static void main(String[] args) {
        Vehicle[] vehicles = Vehicle.VehicleData.generateVehicles(5);
    for (Vehicle vehicle :vehicles) {
        vehicle.printVehicleDetails();
        System.out.println("can climb uphill : "+ vehicle.isClimbUpHill());
        System.out.println("Accerleration: "+ vehicle.getAccelerate(4.0));
        System.out.println("No.of seats : "+ vehicle.getNumSeats());
        System.out.println("NCAP stars: "+ vehicle.getNCAPStars());

        Vehicle.Truck truck = vehicle.new Truck(4,2,12.0);
        truck.printDetails();
        System.out.println();

        vehicle.getOdometry(6.0);
      } 
     
    }
}

enum Make {
    tata,audi,Isuzu,Ford,Bmw,Benz,Leyland
}
enum Color {
    Blue,Grey,silver,white,Red,Black
}

class Vehicle {
    private Make make;
    private Color color;
    private int year;
    private int fuel;
    private double engine;
    private double capacity;
    private int star;


public Vehicle (Make make,Color color,int year,int fuel,double engine,double capacity,int star) {
    this.make = make;
    this.color = color;
    this.year = year;
    this.fuel = fuel;
    this.engine = engine;
    this.capacity = capacity;
    this.star = star;
}
public boolean isClimbUpHill () {
    return engine >=2.0 && fuel!=1;
}
public double getAccelerate(double time){
    return engine-2 *time;
}
public int getNumSeats() {
    return 5;
}
public int getNCAPStars() {
    return star;
}

static class VehicleData {
    public static Vehicle[] generateVehicles(int n) {
        Vehicle[] vehicles = new Vehicle[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
                Make randomMake = Make.values()[rand.nextInt(Make.values().length)];
                Color randomColor = Color.values()[rand.nextInt(Color.values().length)];
                int randomYear = rand.nextInt(12) + 2010;
                int randomFuel = rand.nextInt(3) + 1;
                double randomEngine = rand.nextDouble() * 2 + 1.0;
                double randomCapacity = rand.nextDouble() * 15;
                int randomStar = rand.nextInt(5) + 1;

                vehicles[i] = new Vehicle(randomMake, randomColor, randomYear, randomFuel, randomEngine, randomCapacity, randomStar);
            }

            return vehicles;
        }
    }
    class Truck {
        private int doors;
        private int seatingCapacity;
        private double loadCapacity;

        public Truck(int doors,int seatingCapacity,double loadCapacity) {
            this.doors = doors;
            this.seatingCapacity = seatingCapacity;
            this.loadCapacity = loadCapacity;
        }
        public void printDetails() {
            System.out.println("Truck Details:");
            System.out.println("Make:"+make);
            System.out.println("Color:"+color);
            System.out.println("Year:"+year);
            System.out.println("Doors:"+doors);
            System.out.println("Seating Capacity:"+seatingCapacity);
            System.out.println("Load Capacity:"+loadCapacity+"tons");

        }
    }

public void getOdometry(double time) {
    class Speed {
        public void calculateSpeed() {
            double velocity = 9+8 *time - time*time;
            double acceleration = 8 - 2*time;

            System.out.println("velocity: "+velocity + " m/s ");
            System.out.println("Acceleration: "+acceleration + " m/s^2 ");
        }
    }
    Speed speed = new Speed();
    speed.calculateSpeed();
}
interface PrintData {
    void printAttributes();
}
interface PrintBehaviours {
    void printBehaviours() ;
}
public void printVehicleDetails() {
    System.out.println("Vehicle Details:");
    System.out.println("Make:" +make);
    System.out.println("Color:" +color);
    System.out.println("Year: "+year);
    System.out.println("Fuel:" +fuel);
    System.out.println("Engine:"+engine);
    System.out.println("Capacity:" +capacity);
    System.out.println("NCAP Stars: "+star);
}
}
