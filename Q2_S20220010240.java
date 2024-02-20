
class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobtitle;

    public Employee(String name, String address, double salary, String jobtitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobtitle = jobtitle;
    }

    public String getname() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getsalary() {
        return salary;
    }

    public String getjobtitle() {
        return jobtitle;
    }

    public double caluculateBonus() {
        return 0.0;
    }

    public String generateperformanceReport() {
        return "No Performance report available";
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary, String jobtitle) {
        super(name, address, salary, jobtitle);
    }

    public double caluculateBonus() {
        return getsalary() * 0.15;
    }

    public String generateperformanceReport() {
        return "Excellent";
    }

    public void manageprojects() {
        System.out.println("Managing Projects");
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary, String jobtitle) {
        super(name, address, salary, jobtitle);
    }

    public double caluculateBonus() {
        return getsalary() * 0.15;
    }

    public String generateperformanceReport() {
        return "Average";
    }

    public void manageprojects() {
        System.out.println("Managing Projects");
    }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary, String jobtitle) {
        super(name, address, salary, jobtitle);
    }

    public double caluculateBonus() {
        return getsalary() * 0.15;
    }

    public String generateperformanceReport() {
        return "Average";
    }

    public void manageprojects() {
        System.out.println("Managing Projects");
    }
}

public class Q2_S20220010240 {
    public static void main(String[] args) {
        Manager manager = new Manager("Jack", "12-34 street,city", 600000, "Manager");
        Developer dev = new Developer("Joe", "77-34 street,city", 70000, "Developer");
        Programmer p = new Programmer("june", "199-street,city", 56000, "Programmer");

        System.out.println("Calculating Bonuses:");
        System.out.println("Manager Bonus: " + manager.caluculateBonus());
        System.out.println("Developer Bonus: " + dev.caluculateBonus());
        System.out.println("Programmer Bonus: " + p.caluculateBonus());

        System.out.println("\nGenerating Performance Reports:");
        System.out.println("Manager Performance: " + manager.generateperformanceReport());
        System.out.println("Developer Performance: " + dev.generateperformanceReport());
        System.out.println("Programmer Performance: " + p.generateperformanceReport());
    }
}
