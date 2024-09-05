import java.util.*;
public class Continue{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
    
        do{
            System.out.print("Enter n: ");
            int n = Sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }while(true);

        }
    }
