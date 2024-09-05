import java.util.*;
public class odd_even{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(A);
        if(A%2==0){
            System.out.println(A + "Even");

        }
        else{
            System.out.println("odd");
        }
    }

}