import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter numbers on which you want to perform operation:");
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        System.out.println("Enter operation which you want to perform operation:");
        System.out.println ("1.Addition");
        System.out.println("2.Subtraction ");
        System.out.println("3.Multi ");
        System.out.println ("4.Division ");
        System.out.println ("5.Modulo");
        int number = Sc.nextInt();
        switch (number) {
            case 1: System.out.println(("Perform Addition")+(a+b));
                     break;
            case 2: System.out.println(("Perform Subtraction:")+(a-b));
                    break; 
            case 3: System.out.println(("Perform multiplication:")+(a*b));
                    break;
            case 4: System.out.println(("Perform division:")+(a/b));
                    break;  
            case 5: System.out.println(("Perform modulo:")+(a%b));
                    break;  
            default: System.out.println("No operation");                               
        }
    }
}