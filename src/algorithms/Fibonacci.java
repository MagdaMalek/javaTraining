package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        int fibonacci;
        int a = 0;
        int b = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number for which the Fibonacci sequence is to be calculated: ");
        fibonacci = Integer.parseInt(br.readLine());

        if (fibonacci == 0 || fibonacci ==1){
            System.out.println("Fibonacci sequence = " + fibonacci);
        } else {
            for (int i = 2; i <= fibonacci; i++){
                int tmp = a + b;
                b = a;
                a = tmp;
            }
            System.out.println("Fibonacci sequence = " + a);
        }
    }
}
