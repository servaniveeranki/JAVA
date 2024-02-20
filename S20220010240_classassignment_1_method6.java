
//Method-6 this keyword can be used to return current class instance
public class S20220010240_classassignment_1_method6 {
    private int rollno;
    private String name;
    private float fee;

    void display() {
        System.out.println(this);
    }

    public static void main(String[] args) {

        S20220010240_classassignment_1_method6 obj = new S20220010240_classassignment_1_method6();
        System.out.println(obj);
        obj.display();
    }
}
