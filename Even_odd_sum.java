import java.util.*;
public class Even_odd_sum{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int n;
        int even_sum = 0;
        int odd_sum = 0;
        int choice;
        do{
            System.out.print("Enter n: ");
             n = Sc.nextInt();
            if(n%2==0){
                 even_sum = even_sum + n;
            }
            else{
                odd_sum = odd_sum + n;
            }
            System.out.print(" enter choice: \n 1. for yes \n 2.for no \n");
            choice =Sc.nextInt();
                
        }while(choice==1);
        System.out.println("Sum of even numbers: "+even_sum);
        System.out.println("Sum of odd numbers: "+odd_sum);
        }
}

        
        