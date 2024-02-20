
class MyException extends Exception {
    private String param;

    public MyException(String param) {
        this.param = param;
    }

    public String toString() {
        return "MyException[" + param + "]";
    }
}

public class Q1_S20220010240 {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            if (b == 0) {
                throw new ArithmeticException("invalid Division");
            }
            String str = "abc";
            int num = Integer.parseInt(str);

            String testString = "test";
            if (10 > testString.length()) {
                throw new StringIndexOutOfBoundsException("Index invalid");
            }
            // accessing invalid index in array
            int[] arr = new int[5];
            int index = 10;
            if (index >= arr.length || index < 0) {
                throw new ArrayIndexOutOfBoundsException("array index is invalid");
            }
            throw new MyException("custom parameter");
        } catch (Exception e) {
            if (e instanceof ArithmeticException) {
                System.out.println("invalid division");
            } else if (e instanceof NumberFormatException) {
                System.out.println("Format Mismatch");
            } else if (e instanceof StringIndexOutOfBoundsException) {
                System.out.println("index is invalid");
            } else if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("array index is invalid");
            } else if (e instanceof MyException) {
                System.out.println(e.toString());
            }
        } finally {
            System.out.println("exception handling completed");
        }
    }
}
