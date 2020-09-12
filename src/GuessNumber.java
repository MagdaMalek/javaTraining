import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) throws IOException {
        double computerNumber, userNumber;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        userNumber = Double.parseDouble(br.readLine());

        Random r = new Random();
        computerNumber = Math.round(10 * (r.nextDouble()));

        if  (userNumber == computerNumber){
            System.out.println("Bravo");
        } else {
            System.out.println("Sorry, your number: " + userNumber + ", correct number: " + computerNumber);
        }
    }
}
