import java.util.*;
public class Break{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
       
        do{
            System.out.print("Enter n: ");
            int n = Sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);

        }while(true);
    }
}