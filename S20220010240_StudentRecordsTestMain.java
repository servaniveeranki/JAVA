
import java.util.Arrays;

public class S20220010240_StudentRecordsTestMain {
    public static void main(String[] args) {

        Student s1 = new Student(23, "servani", "veeranki");
        Student s2 = new Student(34, "oshmika", "sannadi");
        Student s3 = new Student(45, "alekya", "veni");
        Student s4 = new Student(93, "harini", "sarva");
        Student s5 = new Student(78, "teja", "pacharu");
        Student s6 = new Student(65, "sameera", "gondela");
        Student s7 = new Student(89, "sandhya", "alamati");
        Student s8 = new Student(11, "priya", "chinta");
        Student s9 = new Student(18, "sumahith", "machiraju");
        Student s10 = new Student(121, "nageshwari", "dharawath");

        // Create an instance of SimpleSortStudentRecords
        SimpleSortStudentRecords studentRecords = new SimpleSortStudentRecords(10);

        // Use addStudent to insert the 10 students
        studentRecords.addStudent(s1);
        studentRecords.addStudent(s2);
        studentRecords.addStudent(s3);
        studentRecords.addStudent(s4);
        studentRecords.addStudent(s5);
        studentRecords.addStudent(s6);
        studentRecords.addStudent(s7);
        studentRecords.addStudent(s8);
        studentRecords.addStudent(s9);
        studentRecords.addStudent(s10);

        // Search for two students
        Student searchedStudent1 = studentRecords.searchStudentByFname("oshmika");
        Student searchedStudent2 = studentRecords.searchStudentByLname("chinta");

        // Print the results using overridden toString method
        System.out.println(searchedStudent1);
        System.out.println(searchedStudent2);

    }
}

class Student {
    private int rollno;
    private String firstname;
    private String lastname;

    public Student(int rollno, String firstname, String lastname) {
        this.rollno = rollno;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getrollno() {
        return rollno;
    }

    public void setrollno(int rollno) {
        this.rollno = rollno;
    }

    public String getfn() {
        // fn represents firstname
        return firstname;
    }

    public void setfn(String firstname) {
        this.firstname = firstname;
    }

    public String getln() {
        // ln represents lastname
        return lastname;
    }

    public void setln(String lastname) {
        this.lastname = lastname;
    }

    public String toString() {
        return "Student{" +
                "rollNo=" + rollno +
                ", firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                '}';
    }
}

abstract class StudentRecords {
    protected Student[] Studentarray;

    public StudentRecords(int capacity) {
        this.Studentarray = new Student[capacity];
    }

    public abstract void addStudent(Student student);

    public abstract Student searchStudentByFname(String firstname);

    public abstract Student searchStudentByLname(String lastname);
}

class SimpleSortStudentRecords extends StudentRecords {
    public SimpleSortStudentRecords(int capacity) {
        super(capacity);
    }

    public void addStudent(Student student) {
        // Add student to the array
        for (int i = 0; i < Studentarray.length; i++) {
            if (Studentarray[i] == null) {
                Studentarray[i] = student;
                break;
            }
        }
        Arrays.sort(Studentarray, (s1, s2) -> {
            if (s1 == null)
                return 1;
            if (s2 == null)
                return -1;
            return s1.getfn().compareTo(s2.getfn());
        });
    }

    public Student searchStudentByFname(String firstname) {
        // performing binary search by firstname
        int low = 0, high = Studentarray.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            Student midstudent = Studentarray[mid];
            if (midstudent == null) {
                high = mid - 1;
                continue;
            }
            int compare = midstudent.getfn().compareTo(firstname);
            if (compare == 0) {
                return midstudent;
            } else if (compare < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public Student searchStudentByLname(String lastname) {
        int low = 0, high = Studentarray.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            Student midstudent = Studentarray[mid];
            if (midstudent == null) {
                high = mid - 1;
                continue;
            }
            int comparision = midstudent.getln().compareTo(lastname);
            if (comparision == 0) {
                return midstudent;
            } else if (comparision < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}
