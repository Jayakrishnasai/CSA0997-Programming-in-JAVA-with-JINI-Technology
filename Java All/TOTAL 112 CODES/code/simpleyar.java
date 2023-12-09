public class simpleyar {

    public static String getDayOfWeek(int day, int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }

        int k = year % 100;
        int j = year / 100;

        int dayOfWeek = (day + ((13 * (month + 1)) / 5) + k + (k / 4) + (j / 4) - (2 * j)) % 7;

        
        dayOfWeek = (dayOfWeek + 5) % 7 + 1;

        String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        return daysOfWeek[dayOfWeek - 1];
    }

    public static void main(String[] args) {
        
        System.out.println(getDayOfWeek(31, 8, 2019));  
        System.out.println(getDayOfWeek(18, 7, 1999));   
        System.out.println(getDayOfWeek(15, 8, 1993));   
    }
}
