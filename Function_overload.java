import java.util.*;
public class Function_overload{
    public static int sum(int a, int b){
        return a+b;

    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static float sum(float a, int b){
        return a+b;}

    public static void main(String args[]){
        int sum1 = sum(5,10);
        System.out.println(sum1);
        int sum2 = sum(5,4,5);
        System.out.println(sum2);
        System.out.println(sum(5.4f,4));
    }
}