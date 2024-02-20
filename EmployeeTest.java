
class Date {
    private int checkDay(int testDay) {
        int daysPerMonth[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // check if day in range for month
        if (testDay > 0 && testDay <= daysPerMonth[month]) {
            return testDay;
        }

        // February 29 check for leap year
        if (month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            return testDay;
        }

        // if it's not a valid day, set to 1
        return 1;
    }

    private int month; // 1-12

    private int day; // 1-31 based on month

    private int year; // any year

    public Date(int theMonth, int theDay, int theYear) {

        month = theMonth;

        year = theYear; // could validate year

        day = checkDay(theDay); // validate day

        System.out.printf("Date object constructor for date %s\n", this);

    }

    public String toString() {

        return String.format("%d/%d/%d", month, day, year);
    }

}

class Employee {

    private String firstName;

    private String lastName;

    private Date birthDate;

    private Date hireDate;

    public Employee(String first, String last, Date dateOfBirth, Date dateOfHire) {

        firstName = first;

        lastName = last;

        birthDate = dateOfBirth;

        hireDate = dateOfHire;

    }

    public String toString() {

        return String.format("%s, %s Hired: %s Birthday: %s",
                lastName, firstName, hireDate, birthDate);

    }

}

public class EmployeeTest {

    public static void main(String[] args)

    {

        Date birth = new Date(7, 24, 1949);

        Date hire = new Date(3, 12, 1988);

        Employee employee = new Employee(
                "Bob", "Blue", birth, hire);

        System.out.println(employee);

    }

}
