import java.util.*;
public class new {
    public static void main(String args[]){
        Scanner fo = new Scanner(System.in);
        int day = fo.nextInt();
        switch(day){
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");                 
                    break;
            default: System.out.println("no day");        
        }
    } 
}