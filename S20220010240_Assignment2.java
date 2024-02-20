import java.util.Scanner;
    
    public class S20220010240_Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating employee objects
        Employee employee1 = createEmployee(input);
        Employee employee2 = createEmployee(input);
        Employee employee3 = createEmployee(input);

        // Displaying employee details
        System.out.println("\nEmployee 1 Details:");
        System.out.println(employee1.DisplayEmployeebyRecords());

        System.out.println("\nEmployee 2 Details:");
        System.out.println(employee2.DisplayEmployeebyRecords());

        System.out.println("\nEmployee 3 Details:");
        System.out.println(employee3.DisplayEmployeebyRecords());

    }

    private static Employee createEmployee(Scanner input) {
        System.out.print("Enter Employee Name: ");
        String name = input.nextLine();

        System.out.print("Enter Employee ID: ");
        String employeeid = input.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic_salary = input.nextDouble();

        System.out.print("Enter Allowance Percentage: ");
        int allowance_percentage = input.nextInt();

        System.out.print("Enter Loan Eligibility (true/false): ");
        boolean loan_eligibility =input.nextBoolean();

        System.out.print("Enter Number of Leaves: ");
        float leaves = input.nextFloat();
        input.nextLine(); // Consume the newline character

        return new Employee(name, employeeid, basic_salary, allowance_percentage, loan_eligibility, leaves);
    }
}
class Employee {
    String name;
    String employeeid;
    double basic_salary;
    int allowance_percentage;
    boolean loan_eligibility;
    float leaves;
    
    public Employee(String name,String employeeid,double basic_salary,int allowance_percentage,boolean loan_eligibility,float leaves){
       this. name = name ; 
       this. employeeid= employeeid;
       this. basic_salary= basic_salary;
       this. allowance_percentage=  allowance_percentage;
       this. loan_eligibility= loan_eligibility;
       this. leaves =  leaves;
    }
    public double calculatesalary() {
         return basic_salary + (basic_salary * allowance_percentage / 100.0);
    }
    public String DisplayEmployeebyRecords() {
         return "Name: " + name +
         "\nEmployee ID: " + employeeid +
         "\nBasic Salary: " + basic_salary +
         "\nAllowance Percentage: " + allowance_percentage +
         "\nLoan Eligibility: " + loan_eligibility +
         "\nNumber of Leaves: " + leaves;
}
    public float getleaves() {
        return leaves;
    }
}

