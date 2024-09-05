import java.util.*;
public class star{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        for(int line=1; line<=4; line++){
            for(int Star=1; Star<=line; Star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}