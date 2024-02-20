
abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private double fuelefficiency;

    public Vehicle(String make, String model, int year, String fuelType, double fuelefficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelefficiency = fuelefficiency;
    }

    public String getmake() {
        return make;
    }

    public String getmodel() {
        return model;
    }

    public int getyear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelEfficiency() {
        return fuelefficiency;
    }

    public abstract double caluculateDistance(double fuel);

    public abstract double caluculateMaxSpeed(double horsepower);

    public abstract double caluculateFuelEfficiency();
}

class Truck extends Vehicle {
    private double cargocapacity;

    public Truck(String make, String model, int year, String fuelType, double fuelefficiency, double cargocapacity) {
        super(make, model, year, fuelType, fuelefficiency);
        this.cargocapacity = cargocapacity;
    }

    public double caluculateDistance(double fuel) {
        return fuel * getFuelEfficiency();
    }

    public double caluculateMaxSpeed(double horsepower) {
        return 60 + (horsepower * 2);
    }

    public double caluculateFuelEfficiency() {
        return getFuelEfficiency() * 0.7;
    }
}

class Motorcycle extends Vehicle {
    private double engineDisplacement;

    public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency,
            double engineDisplacement) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.engineDisplacement = engineDisplacement;
    }

    public double caluculateDistance(double fuel) {
        return fuel * getFuelEfficiency();
    }

    public double caluculateMaxSpeed(double horsepower) {
        return 80 + (horsepower * 2.5);
    }

    public double caluculateFuelEfficiency() {
        return getFuelEfficiency() * 0.8;
    }
}

class Car extends Vehicle {
    private int numSeats;

    public Car(String make, String model, int year, String fuelType, double fuelEfficiency, int numSeats) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.numSeats = numSeats;
    }

    public double caluculateDistance(double fuel) {
        return fuel * getFuelEfficiency();
    }

    public double caluculateMaxSpeed(double horsepower) {
        return 100 + (horsepower * 3);
    }

    public double caluculateFuelEfficiency() {
        return getFuelEfficiency() * 0.9;
    }
}

public class Q3_S20220010240 {
    public static void main(String[] args) {
        Truck truck = new Truck("Volvo", "VNL", 2020, "Diesel", 6.2, 5000);
        Car car = new Car("Toyota", "Camry", 2019, "Gasoline", 8.5, 5);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2021, "Gasoline", 5.0, 500);

        System.out.println("Truck Details:");
        System.out.println("Make: " + truck.getmake());
        System.out.println("Model: " + truck.getmodel());
        System.out.println("Year: " + truck.getyear());
        System.out.println("Fuel Type: " + truck.getFuelType());
        System.out.println("Cargo Capacity: " + truck.caluculateFuelEfficiency());
        System.out.println("Max Speed: " + truck.caluculateMaxSpeed(300));

        System.out.println("\nCar Details:");
        System.out.println("Make: " + car.getmake());
        System.out.println("Model: " + car.getmodel());
        System.out.println("Year: " + car.getyear());
        System.out.println("Fuel Type: " + car.getFuelType());
        System.out.println("Number of Seats: " + car.caluculateFuelEfficiency());
        System.out.println("Max Speed: " + car.caluculateMaxSpeed(200));

        System.out.println("\nMotorcycle Details:");
        System.out.println("Make: " + motorcycle.getmake());
        System.out.println("Model: " + motorcycle.getmodel());
        System.out.println("Year: " + motorcycle.getyear());
        System.out.println("Fuel Type: " + motorcycle.getFuelType());
        System.out.println("Engine Displacement: " + motorcycle.caluculateFuelEfficiency());
        System.out.println("Max Speed: " + motorcycle.caluculateMaxSpeed(150));
    }
}
