//Method-2 this to invoke current class method
public class S20220010240_classassignment_1_method2 {
    public static void main(String[] args) {
        Student s1 = new Student(122,"sai",45000f);
        Student s2 = new Student(111,"venu",56000f);
        s1.details();
        s2.details();
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
    void details(){
        this.display();
    }

    void display() {
        System.out.printf(" Rollno: %d\n Name :%s\n  Fee :%f\n ", rollno, name, fee);
    }
}