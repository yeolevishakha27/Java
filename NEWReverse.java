import java.util.*;
public class NEWReverse{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int rev = 0;
        int n = 2711;
        while(n>0){
            int last_digit=n%10;
            rev = (rev*10+last_digit);
            n=n/10;
        }
        System.out.println(rev);

    }
}