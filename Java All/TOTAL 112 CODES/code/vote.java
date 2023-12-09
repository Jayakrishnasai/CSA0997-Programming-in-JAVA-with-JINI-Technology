

import java.util.*;

public class vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            
            if (age >= 18) {
                System.out.println("You are allowed to vote.");
            } else {
                System.out.println("Your are not eligible.");
            }
        } else {
            System.out.println("Wrong input. Please enter a valid numerical age.");
        }
        
        scanner.close();
    }
}

