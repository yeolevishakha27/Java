import java.util.*;
public class loopwhile{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int n = 1;
        System.out.println("Enter last range:");
        int range = Sc.nextInt();
        while(n<=range){
            System.out.println(n);
            n++;
        }
    }
}