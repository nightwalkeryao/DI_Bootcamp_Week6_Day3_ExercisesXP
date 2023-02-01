import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
        String stars;
        for (int i = 1; i <= 4; i++) {
            stars = "";
            for (int j = 1; j <= i; j++) {
                stars += "* ";
            }
            System.out.println(stars.trim());
        }

        // Exercise 2
        String numbers;
        for (int i = 1; i <= 7; i++) {
            numbers = "";
            for (int j = 1; j <= i; j++) {
                numbers += i;
            }
            System.out.println(numbers);
        }

        // Exercise 3
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        input = scanner.nextInt();
        scanner.close();

        String[] digits = String.valueOf(input).split("", 0);
        List<String> reversedDigitsList = new ArrayList<String>();

        for (int i = digits.length - 1; i >= 0; i--) {
            reversedDigitsList.add(digits[i]);
        }

        System.out.println("Reversed input: " + String.join("", reversedDigitsList));

        // Exercise 4
        for (int i = 1; i <= 500; i++) {
            String[] digitsArray = String.valueOf(i).split("", 0);
            int sum = 0;
            for (int j = 0; j < digitsArray.length; j++) {
                sum += (int) Math.pow(Double.valueOf(digitsArray[j]), 3);
            }
            if (sum == i) {
                System.out.printf("\n%d is an Armstrong number.", i);
            }
        }
    }
}