import java.util.*;
public class inverted{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        for(int line=1; line<=4; line++){
            for(int Star=1; Star<=(4-line+1); Star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}