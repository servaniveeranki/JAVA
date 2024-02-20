
interface Parent {

    void foo();

}

class A implements Parent

{

    A(int x, int y) {

    }

    public void foo() {

        System.out.println("In the foo method of class A.");

    }

}

class B extends A {

    B(int x, int y) {
        super(x, y);
        // TODO Auto-generated constructor stub
    }

    public void foo()

    {
        super.foo();

        System.out.println("In the foo method of class B.");

    }

}

public class Couplig

{

    public static void main(String argvs[])

    {

        B obj = new B(2, 3);

        obj.foo();
    }
}