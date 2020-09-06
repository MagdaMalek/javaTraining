package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangularNumbers {
    public static void main(String[] args) throws IOException {
        int triangularNumber;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        triangularNumber = Integer.parseInt(br.readLine());

        for (int i = 1; i <= triangularNumber; i++) {
            System.out.println(triangularRecursion(i));
        }

        for (int i = 1; i <= triangularNumber; i++) {
            System.out.println(triangular(i));
        }
    }

    static int triangularRecursion(int triangularNumber) {
        if (triangularNumber == 1) {
            return 1;
        } else {
            return triangularNumber + triangularRecursion(triangularNumber - 1);
        }
    }

    static int triangular (int triangularNumber) {
        int tmp = 1;
        for (int i = 2; i <= triangularNumber; i++){
            tmp += i;
        }
        return tmp;
    }
}
