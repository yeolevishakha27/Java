import java.util.*;
public class again{
    public static void Deci(int deci){
        int bin = 0;
        int rem;
        int i = 0;
        while(deci > 0){
            rem = deci % 2;
            bin = bin +(rem *(int)Math.pow(10,i));
            i++;
            deci = deci /2 ;
        }
System.out.println("bin is" + bin);
 }
}

public static void main(String args[]) {
        // Scanner Sc = new Scanner(System.in);
        // System.out.println("Enter decimal number");
        // int deci = Sc.nextInt();
        Deci(5);
    }
