import java.util.*;
public  class positive_negative{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = Sc.nextInt();
        if(num>0){
            System.out.println("num is positive");
        } 
        else{
            System.out.println("num is negative");
        }
    }

}