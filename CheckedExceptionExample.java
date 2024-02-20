import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            // Code that may throw a checked exception
            throw new IOException("This is a checked exception.");
        } catch (IOException e) {
            System.out.println("Caught the checked exception: " + e.getMessage());
        }
    }
}




