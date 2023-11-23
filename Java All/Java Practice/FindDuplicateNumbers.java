import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Read the array elements
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Find and print duplicate numbers
        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicateNumbers = new HashSet<>();

        for (int number : numbers) {
            if (!uniqueNumbers.add(number)) {
                // If the number is already in the set, it's a duplicate
                duplicateNumbers.add(number);
            }
        }

        System.out.println("Duplicate numbers in the array: " + duplicateNumbers);

        scanner.close();
    }
}
