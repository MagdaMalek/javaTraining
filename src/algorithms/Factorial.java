package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        int factorialNumber;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        factorialNumber = Integer.parseInt(br.readLine());
        System.out.println("Factorial (recursion): " + factorialRecursion(factorialNumber));
        System.out.println("Factorial: " + factorial(factorialNumber));

    }

    static int factorialRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialRecursion(n - 1);
        }
    }

    static int factorial (int n) {
        int ratio = 1;
        for (int i = 1; i <= n ; i++) {
            ratio *= i;
        }
        return ratio;
    }
}
