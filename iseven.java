import java.util.*;
public class iseven{
    public static void ISEVEN(int a){
        if(a%2==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        

    }

    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
    
        ISEVEN(a);
    }
}