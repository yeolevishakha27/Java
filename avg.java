import java.util.*;
public class avg{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int A = Sc.nextInt();
        int B = Sc.nextInt();
        int C = Sc.nextInt();
        float avg = (A + B + C)/3;
        System.out.println(avg);

    }
}