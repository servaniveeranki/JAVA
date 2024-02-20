//Method-5 this to pass as an argument in the constructor call
public class S20220010240_classassignment_1_method5 {
    int rollno = 234;
    String name = "venkat";
    float fee = 56000f;
    S20220010240_classassignment_1_method5(){
        Student s = new Student(this);
        s.display();
    }

    public static void main(String[] args) {
        S20220010240_classassignment_1_method5 assign = new S20220010240_classassignment_1_method5();
        
    }
}

class Student {
    private int rollno;
    private String name;
    private float fee;
    S20220010240_classassignment_1_method5 obj;

     Student(S20220010240_classassignment_1_method5 obj) {
        this.obj=obj;
    }
    void display() {
        System.out.printf("rollno:%d\n name :%s\n fee :%f\n",obj.rollno,obj.name,obj.fee);
    }
}
