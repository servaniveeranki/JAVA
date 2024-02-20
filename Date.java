

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int theMonth, int theDay, int theYear) {
        month = theMonth;
        day = theDay;
        year = theYear;
    }

    // Getter methods for month, day, and year
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    // toString method to display the Date object as a string
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }

    public static void main(String[] args) {
        Date date = new Date(9, 18, 2023);
        System.out.println("Formatted Date: " + date.toString());
    }
}