import java.util.*;
public class sum_int{
    public static void sumint(int n){
int sum = 0;
while(n > 0){
    int last_digit = n % 10;
    n = n /10;
    sum = sum + last_digit;
}
System.out.println("Sum of digit is:" + sum);
    }

    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter num:");
        int n = Sc.nextInt();
        sumint(n);    
    }
}
