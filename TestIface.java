
interface CallBack {
    void callback(int param);
}

class Client implements CallBack {
    public void callback(int p) {
        System.out.println("callback called with" + p);
    }

    void nonIfaceMeth() {

        System.out.println("Classes that implement interfaces " + "may also define other members, too.");

    }
}

public class TestIface {
    public static void main(String[] args) {
        CallBack c = new Client();
        c.callback(42);
    }
}
