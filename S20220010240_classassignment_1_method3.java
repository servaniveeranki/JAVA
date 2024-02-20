//Method-3 this to invoke current class constructor
public class S20220010240_classassignment_1_method3 {
    public static void main(String[] args) {
        Student s1 = new Student(177,"srinu",45000f);
        Student s2 = new Student(765,"venu",80000f);
         s1.display();
         s2.display();
       
    }
}

class Student {
    private int rollno;
    private String name;
    private float fee;

     Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    Student(int rollno, String name, float fee) {
        this(rollno,name);
        this.fee = fee;
    }

    void display() {
        System.out.printf(" Rollno: %d\n Name :%s\n  Fee :%f\n ", rollno, name, fee);
    }
}

