// Method -1 this to refer current class instance variable
public class S20220010240_classassignment_1_method1 {
    public static void main(String[] args) {
        Student s1 = new Student(11, "servani", 30000f);
        Student s2 = new Student(56, "Oshmika", 40000f);
        s1.display();
        s2.display();
    }
}

class Student {
    private int rollno;
    private String name;
    private float fee;

    Student(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }
void display() {
        System.out.printf(" Rollno: %d\n Name :%s\n  Fee :%f\n ", rollno, name, fee);
    }
}


