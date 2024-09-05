import java.util.*;
public class ternary{
    public static void main(String args[]){
        Scanner fo = new Scanner(System.in);
        int number = 4;
       String type =((number%2)==0) ? "even" :"odd";
       System.out.println(type);
       int marks= fo.nextInt();
       String result =(marks>=33)?"PASS":"FAIL";
       System.out.println(result);

       

    }
}