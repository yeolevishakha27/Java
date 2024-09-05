import java.util.*;
public class reverse{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = Sc.nextInt();
        while(num > 0){
            int last_digit = num % 10;
            System.out.print(last_digit);
            num = num/10;
        }

    }
}