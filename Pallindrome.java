import java.util.*;
public class Pallindrome{
    public static void pallindrome(int a){
        int rev = 0;
        int b = a;
        while(a>0){
            int last_digit = a % 10;
            a = a/10;
            rev = (rev*10)+last_digit;
        }
        if(rev==b){
            System.out.println("No is Pallindrome");
        }

        else{
            System.out.println("no pallindrome");
        }

    }

    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = Sc.nextInt();
        pallindrome(a);
    }
}