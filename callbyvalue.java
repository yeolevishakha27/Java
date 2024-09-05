import java.util.*;
public class callbyvalue{
  //swap
    public static void swap(int a, int b){
        int temp = a;
         a = b;
         b = temp;

        System.out.println("a =" +a);
        System.out.println("a =" +b);


    }
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int a = 2;
        int b = 3;
        swap(a,b);
        
    }
}