package B01Advanced;

/** @author Stephen */

/**
 *
 * % java Fibonacci 7 0: 0 1: 1 2: 1 3: 2 4: 3 5: 5 6: 8 7: 13
 *
 */
public class Fibonacci {

    // --------------- recursive version ---------------------
    public static long fibRe(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibRe(n - 1) + fibRe(n - 2);
        }
    }

    // --------------- iterative version ---------------------
    public static int fibIt(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int prev1  = 0,
            prev2  = 1,
            result = 1;

        for (int i = 2; i <= n; i++) {
            result = prev2 + prev1;
            prev1  = prev2;
            prev2  = result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Recursive");

        for (int i = 0; i <= 7; i++) {
            System.out.println(i + ": " + fibRe(i));
        }

        System.out.println("\nIterative");

        for (int i = 0; i <= 7; i++) {
            System.out.println(i + "; " + fibIt(i));
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
