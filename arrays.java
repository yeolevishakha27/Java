import java.util.*;
public class arrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[50]; // array of size 50 is created
        int numbers[]={1,2,3};
        String fruits[]={"apple","mango","banana"};

        //input in array
        int Marks[]= new int [100];
        Marks[0]=sc.nextInt();//phy
        Marks[1]=sc.nextInt();//Chem
        Marks[2]=sc.nextInt();//math
// output in array
        System.out.println("Phy : "+Marks[0]);
        System.out.println("Chem : "+Marks[1]);
        System.out.println("math : "+Marks[2]);
//value update;

        Marks[2]=100; //value update;
        System.out.println("math : "+Marks[2]);

        Marks[1]=Marks[2]-1;
        System.out.println("Chem : "+Marks[1]);
 //length of array       
 System.out.println("length of array is:"+Marks.length);

    }

}