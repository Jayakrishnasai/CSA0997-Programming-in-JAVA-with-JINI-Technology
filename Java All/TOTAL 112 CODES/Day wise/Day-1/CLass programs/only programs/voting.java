import java.util.*;
public class voting {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();
        if (age>=18) 
        {
            System.out.println("Your eligible to vote");
            
        }
        else{
            System.out.println("your are  not eligible to vote ");
        }
    }
    
}
