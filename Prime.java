import java.util.*;
public class Prime{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int div;
        int n = Sc.nextInt();
        for( div=2; div <= n-1; div++){
            if(n%div==0){
                break;
            }
        }
        if(div == n){
            System.out.println("no is prime");
        }
        else{
             System.out.println("no is not prime");

        }

    }
}