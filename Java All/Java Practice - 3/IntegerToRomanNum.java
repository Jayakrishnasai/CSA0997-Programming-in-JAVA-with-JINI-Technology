import java.util.Scanner;

public class IntegerToRomanNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Integer between 1 to 3999: ");
        int num = scanner.nextInt();

        if (num < 1 || num > 3999) {
            System.out.println("Invalid Integer");
        } else {
            String roman = convertToRoman(num);
            System.out.println("The Roman Number is " + roman);
        }
        scanner.close();
    }

    private static String convertToRoman(int num) {
        String[] romanSymbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        StringBuilder roman = new StringBuilder();

        for (int i = values.length - 1; i >= 0; i--) {
            while (num >= values[i]) {
                roman.append(romanSymbols[i]);
                num -= values[i];
            }
        }

        return roman.toString();
    }
}
