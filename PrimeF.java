import java.util.*;
public class PrimeF{
    public static boolean isPrime(int n){

        if(n==2){
            return true;
        }
    //     boolean isPrime = true;
    //     for(int i=2; i<=n-1; i++){
    //         if(n%i == 0){
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;   
    // }

     for(int i= 2; i<=Math.sqrt(n); i++){
        if(n%i == 0){
            return false;
        }
     }
     return false;
    }

    public static int primeinrange(int r){
        for(int i = 2; i<=r; i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        primeinrange(20);
    }
}