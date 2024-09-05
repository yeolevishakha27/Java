import java.util.*;
public class NewFactorial{
    public  static int factorial(int a){
        int f = 1;
        for(int i =1; i<=a; i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String args[]){
        int a = 4;
        int fact = factorial(a);
        System.out.println (fact);
        int ans = factorial(5);
        System.out.println (ans);
        
    }
}