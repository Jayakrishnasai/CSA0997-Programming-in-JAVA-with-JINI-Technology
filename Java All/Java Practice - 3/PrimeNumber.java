import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else if (number == 2) {
            System.out.println(number + " is a prime number.");
        } else {
            // Check for divisibility from 2 to half of the number
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime number.");
                    return; // exit the program as we know it's not prime
                }
            }
            System.out.println(number + " is a prime number.");
        }

        scanner.close();
    }
}
