

import java.util.Scanner;

public class mainfib_S20220010240 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number:");
        n = input.nextInt();
        fib obj1 = new fib();
        System.out.println("THIS IS A RECURSIVE METHOD ");
        for (int i = 0; i <= n; i++) {
            System.out.printf("%d ", obj1.recursivefib(i));
        }
        System.out.println();
        fib obj2 = new fib();
        obj2.nonrecursivefib(n);
        input.close();

    }
}

class fib {
    public int recursivefib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recursivefib(n - 1) + recursivefib(n - 2);
        }
    }

    public void nonrecursivefib(int n) {
        System.out.println("THIS IS A NON-RECURSIVE METHOD ");
        int[] fib_series = new int[n + 1];
        fib_series[0] = 0;
        fib_series[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib_series[i] = fib_series[i - 1] + fib_series[i - 2];
        }
        for (int i = 0; i <= n; i++) {
            System.out.printf("fib[%d] = %d ", i, fib_series[i]);
        }

    }
}
