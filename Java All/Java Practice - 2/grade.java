import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        try {
            float m1, m2, m3, m4, m5, m6;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter marks in Python:");
            m1 = sc.nextInt();
            System.out.println("Enter marks in C Programming:");
            m2 = sc.nextInt();
            System.out.println("Enter marks in Mathematics:");
            m3 = sc.nextInt();
            System.out.println("Enter marks in Physics:");
            m5 = sc.nextInt();
            System.out.println("Enter marks in Chemistry:");
            m6 = sc.nextInt();
            System.out.println("Enter marks in Professional Ethics:");
            m4 = sc.nextInt();

            sc.close(); // Closing the Scanner

            if (m1 > 100 || m2 > 100 || m3 > 100 || m4 > 100 || m5 > 100 || m6 > 100) {
                throw new IllegalArgumentException("Invalid input due to higher values.");
            }

            if (m1 < 0 || m2 < 0 || m3 < 0 || m4 < 0 || m5 < 0 || m6 < 0) {
                throw new IllegalArgumentException("Invalid input due to negative values.");
            }

            float total = m1 + m2 + m3 + m4 + m5 + m6;
            float agg = total / 6;

            System.out.println("Total Marks: " + total);
            System.out.println("Aggregate: " + agg);

            if (agg > 75) {
                System.out.println("Grade: Distinction");
            } else if (agg >= 60 && agg < 75) {
                System.out.println("Grade: First Division");
            } else if (agg >= 50 && agg < 60) {
                System.out.println("Grade: Second Division");
            } else if (agg >= 40 && agg < 50) {
                System.out.println("Grade: Third Division");
            } else {
                System.out.println("Grade: FAIL");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
