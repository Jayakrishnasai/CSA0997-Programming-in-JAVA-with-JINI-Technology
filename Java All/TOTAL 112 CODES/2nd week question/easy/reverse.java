import java.util.*; 
public class reverse 
{ 
 public static void main(String[] args) 
 { 
 
 String a,b=""; 
 char c; 
 int d=0,i; 
 try 
 { 
 try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter the string:"); 
     a=sc.next();
} 
 d=a.length(); 
 
 for(i=d-1;i>=0;i--) 
 { 
 b=b+a.charAt(i); 
 
 } 
 
 System.out.println("The Reverse of the string is:"+ b); 
 
 } 
 catch(Exception e) 
 { 
 System.out.println("Enter only string"); 
 } 
 
 } 
}