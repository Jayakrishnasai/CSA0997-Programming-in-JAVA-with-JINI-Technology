public class ReverseString {

    public static void main(String[] args) {
        String str = "1245";
        String reversedString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }

        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedString);
    }
}
