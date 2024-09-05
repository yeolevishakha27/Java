import java.util.*;
public class function{

    public static void printHW(){
        System.out.println("hw");
        return; //due to void we have take only return
    }

    public static void calculatesum(int a, int b)//formal parameters{
        int sum = a + b;
        System.out.println("Sum is :"+ sum);
    }
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        printHW(); //function call
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        calculatesum(a,b);
    }
}