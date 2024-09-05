import java.util.*;
public class income_taxcalculator{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        if(income<500000){
            System.out.println("No TAX");
        }
        else if(500000<=income && income <1000000){
            System.out.println(("TAX is 20%:")+ (0.20*income));

        }
        else{
             System.out.println(("TAX is 30%:")+ (0.30*income));
        }
    }
}