import java.util.*;
public class table{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= Sc.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println (i + "*" + n + "=" + i*n);
        }
    }
}