//Method-4 this to pass as an argument in the method
public class S20220010240_classassignment_1_method4 {
    public static void main(String[] args) {
        Student s1 = new Student(177,"srinu",45000f);
        Student s2 = new Student(765,"vamsi",80000f);
         s1.details();
         s2.details();
       
    }
}

class Student {
    private int rollno;
    private String name;
    private float fee;

     Student(int rollno, String name,float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }
    void details(){
        display(this);
    }
  
    void display(Student obj) {
        System.out.printf(" Rollno: %d\n Name :%s\n  Fee :%f\n ", rollno, name, fee);
    }
}

