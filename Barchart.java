import java.util.Scanner;

public class Barchart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of cases in the bar chart: ");
        int numValues = scanner.nextInt();

        int[] values = new int[numValues];

        for (int i = 0; i < numValues; i++) {
            System.out.println("ENTER THE NUMBER OF VALUES FOR CASE-" + (i + 1));
            values[i] = scanner.nextInt();
        }

        System.out.println("Bar Chart:");

        for (int value : values) {
            for (int j = 0; j < value; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
    }
