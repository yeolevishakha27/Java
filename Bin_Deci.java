import java.util.*;
public class Bin_Deci{
    public static int deci(int n){
        int decimal = 0;
        int i = 0;
        while(n > 0){
            int last_digit = n % 10;
            decimal = decimal +(last_digit *(int)Math.pow(2,i));

            i++;
            n = n / 10;
        }    
        System.out.println("decimal is:"+ decimal);
        return n;   
    }
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter binary number");
        int n = Sc.nextInt();
        deci(n);
    }
}
