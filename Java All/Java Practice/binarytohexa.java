public class binarytohexa {
    public static void main(String[] args) {
        String binaryNumber = "1101101";

        if (!isBinary(binaryNumber)) {
            System.out.println("Invalid binary number. Please enter a valid binary number.");
            return;
        }
        String hexadecimalNumber = binaryToHexadecimal(binaryNumber);

        System.out.println("Hexadecimal equivalent: " + hexadecimalNumber);
    }
    private static boolean isBinary(String str) {
        return str.matches("[01]+");
    }
    private static String binaryToHexadecimal(String binaryNumber) {
        int decimalNumber = Integer.parseInt(binaryNumber, 2);

        return Integer.toHexString(decimalNumber).toUpperCase();
    }
}
