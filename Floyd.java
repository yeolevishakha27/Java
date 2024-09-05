import java.util.*;
public class Floyd{
    public static void pyramid(int n){
        int a = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(a++ +"  ");
            }
            System.out.println();
        }
    }
        public static void main(String args[]){
        pyramid(5);
    
    }
}