import java.util.*;
public class methods{
    public static void operation(double a, double b){
        double min = Math.min(a,b);
        System.out.println("min is" + min);
        double max = Math.max(a,b);
        System.out.println("max is" + max);
        double sqrt = Math.sqrt(a);
        System.out.println("sqrt is" + sqrt);
        double pow = Math.pow(a,b);
        System.out.println("pow is" + pow);
        double abs = Math.abs(a);
        System.out.println("abs is" + abs);
    }


public static void main(String args[]){
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter a & b");
    double a = Sc.nextDouble();
    double b = Sc.nextDouble();
    operation(a,b);
}

}