import java.util.*;
public class Multiply{
    public static int multiply(int a,int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]) {
        int a = 3;
        int b = 5;
        int prod = multiply(a,b);
        System.out.println("a*b =" + prod);
        int ans = multiply(10,5);
        System.out.println("a * b = " + ans);
    }
}