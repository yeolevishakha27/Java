import java.util.*;
public class ArrayFunction{
    public static void update(int score[]){
    for(int i=0;i<score.length;i++){
        score[i]=score[i] +1;
    }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

    // array as function argument:-
    int score[]={97,98,99};
    update(score);

    //print marks
    for(int i=0;i<score.length;i++){
        System.out.print(score[i]+" ");
    }
    System.out.println();

    }
}