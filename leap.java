import java.util.*;
public class leap{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = Sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        }
         else {
            System.out.println(year + " is not a leap year");
         }
        
        
}
}
