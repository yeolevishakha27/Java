import java.util.*;
public class bill{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of items:");
        System.out.print("Pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Pen: ");
        float pen = sc.nextFloat();
        System.out.print("Eraser: ");
        float eraser = sc.nextFloat();
        float Cost = pencil + pen + eraser ;
        System.out.print("cost is: ");
        System.out.println(Cost);
        float GST = 0.18f * Cost;
        System.out.print("GST is: ");
        System.out.println(GST);
        Float Total_bill = Cost + GST;
        System.out.print("Total bill is: ");
        System.out.println(Total_bill);
        int $ = 24;
        System.out.println($);

    }
}