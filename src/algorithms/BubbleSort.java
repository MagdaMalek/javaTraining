package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        int[] numbers = new int[10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the numbers to be sorted");

        for (int i = 0; i < numbers.length; i++){
           numbers[i] = Integer.parseInt(br.readLine());
        }

        System.out.println();

        sort(numbers);
    }

    private static void sort(int[] numbers){
        int n;
        for (int i = 0; i < numbers.length -1; i++) {
            for (int j = 0; j < numbers.length -1; j++){
                if (numbers[j]>numbers[j+1]){
                    n = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = n;
                }
            }
            System.out.println(numbers[i]);
        }
    }
}
