class A {

    void callme() {

        System.out.println("Inside A's callme method");
    }

}

class B extends A {

    void callme() {

        System.out.println("Inside B's callme method");
    }

}

class C extends A {

    void callme() {

        System.out.println("Inside C's callme method");
    }

}

class Dispatch {

    public static void main(String args[]) {

        A a = new A();

        B b = new B();

        C c = new C();

        A r; // obtain a reference of type A

        r = a;

        r.callme(); // calls A's version of

        r = b; // r refers to a B object

        r.callme(); // calls B's version of

        r = c; // r refers to a C object

        r.callme();

    }

}