import java.util.*;
public class Binomial{
     public  static int factorial(int a){
        int f = 1;
        for(int i =1; i<=a; i++){
            f = f*i;
        }
        return f;

     }

    public  static int binomial(int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(n-r);

        int bincoeff = fact_n /(fact_r * fact_nr);
        return bincoeff;
    }

    public static void main(String args[]){
        System.out.println(binomial(5,2));
    }
}