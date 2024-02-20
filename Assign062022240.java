
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.Period;

public class Assign062022240 {
    public static void main(String[] args) {
        SpareBank bank = new SpareBank("Sparebank Inc.", "123 main street");
        customer cust = new customer("SpareBank Inc.", "123 main street", "smitha", "01/01/1990", "manager",
                "456-nehru street", "CIF1234567890", 1500.0);
        bank.displayinfo();
        System.out.println("Customer Name: " + cust.getName());
        System.out.println("Customer Age: " + cust.getAge());
    }
}

class SpareBank {
    private String branchname;
    private String branchLocation;

    public SpareBank(String branchname, String branchLocation) {
        this.branchname = branchname;
        this.branchLocation = branchLocation;
    }

    public String Getbranch_name() {
        return branchname;
    }

    public String getbranch_location() {
        return branchLocation;
    }

    public void displayinfo() {
        System.out.println("Branchname:" + branchname);
        System.out.println("Branchlocation:" + branchLocation);

    }
}

class customer extends SpareBank {
    private String name;
    private String dob;
    private String designation;
    private String address;
    private String CIFnum;
    private double balance;

    public customer(String branchname, String branchLocation, String name, String dob, String designation,
            String address, String CIFnum, double balance) {
        super(branchname, branchLocation);
        this.name = name;
        this.dob = dob;
        this.designation = designation;
        this.address = address;
        this.CIFnum = CIFnum;
        this.balance = balance;

    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getDesignation() {
        return designation;
    }

    public String getAddress() {
        return address;
    }

    public String getCifNumber() {
        return CIFnum;
    }

    public double getBalance() {
        return balance;
    }

    public String getAge() {
        LocalDate dobDate = LocalDate.parse(dob, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(dobDate, currentDate);
        int years = age.getYears();
        int months = age.getMonths();

        return years + "years and" + months + "months";
    }

    public boolean isValid(String identityinfo) {
        if (identityinfo != null && !identityinfo.isEmpty()) {
            return true;
        }
        return false;
    }

    public void showAccounts(String CIFnum, String identityInfo) {
        // Assuming you have a method to fetch account details by CIF number
        Account[] accounts = fetchAccountsByCIF(CIFnum);

        if (accounts != null && accounts.length > 0) {
            // Iterate through the accounts and display details
            for (Account account : accounts) {
                // Customize the format and content of account details as needed
                String accountInfo = "Account Number: " + account.getAccountnum() + "\n"
                        + "Account Balance: " + account.getBalance() + "\n";
                System.out.println(accountInfo);
            }
        } else {
            System.out.println("No accounts found for CIF number: " + CIFnum);
        }
    }

    private Account[] fetchAccountsByCIF(String CIFnum) {
        // Replace this with actual database query code
        List<Account> accounts = new ArrayList<>();

        // Simulated accounts
        accounts.add(new Account("ACC123456", 2500.0, CIFnum));
        accounts.add(new Account("ACC789012", 1500.0, CIFnum));

        return accounts.toArray(new Account[0]);
    }
}

class Account {
    private String accountnum;
    private double balance;
    private String CIF;

    public Account(String accountnum, double balance, String CIF) {
        this.accountnum = accountnum;
        this.balance = balance;
        this.CIF = CIF;
    }

    public String getAccountnum() {
        return accountnum;
    }

    public double getBalance() {
        return balance;
    }

    public String getCIF() {
        return CIF;
    }
}
