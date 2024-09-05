import java.util.*;
public class Hollow_square{
    public static void square(int n){
        for(int i = 1; i<=n; i++){
            for(int j= 1; j<=n; j++){
                if(i==1 || i== n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
             System.out.println();
        }

    }
//1
//12
//123
//1234

    public static void patteren(int a){
        
        for(int i = 1; i<=a; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
          System.out.println();  
        }
      System.out.println();
    }


    //1234
    //123
    //12
    //1

     public static void invert(int b){
        
        for(int i = b; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
          System.out.println();  
        }
           System.out.println();
    }
    //1
    //23
    //456
    //78910

     public static void abd(int c){
        int d=1;
        for(int i = 1; i<=c; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(d++);
            }
          System.out.println();  
        }
      System.out.println();
    }

    //1
    //01
    //101
    //0101

    public static void oddzero(int e){
        for(int i = 1; i<=e; i++){
            for(int j = 1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
//   1
//  2 2
// 3 3 3
//4 4 4 4
    public static void patternone(int f){
        for(int i= 1; i<=f; i++){
            for(int j=1; j<=(f-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
        System.out.println();
        }
    }

    //       1
    //     2 1 2 
    //   3 2 1 2 3 
    // 4 3 2 1 2 3 4 

    public static void pallindrome_triangle(int g){
        for(int i=1; i<=g;i++){
            for(int j=1; j<=2*(g-i);j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void pt(int h){
        for(int i=1; i<=h; i++){
            for(int j=1; j<=(h-i); j++){
                System.out.print("  ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j + " ");
            }

            for(int j=2; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //    ****
    //  ****
   // ****
  //****

  public static void rhombus(int rh){
    for(int i=1; i<=rh; i++){
        for(int j=1; j<=(rh-i); j++){
            System.out.print(" ");
        }
        for(int j=1;j<=rh;j++){
            System.out.print("*");
        }
        System.out.println();
    }
  }

  //Diamond star pattern
  public static void diamond(int di){
    for(int i=1; i<=di; i++){
        for(int j = 1; j<=(di-i);j++){
            System.out.print(" ");
        }
        for(int j=1; j<=(2*i-1); j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=di; i>=1; i--){
        for(int j = 1; j<=(di-i);j++){
            System.out.print(" ");
        }
        for(int j=1; j<=(2*i-1); j++){
            System.out.print("*");
        }
        System.out.println();
    }
  }

  //Butterfly star pattern
  public static void butterfly(int bt){
    for(int i = 1; i<=bt; i++){
        for(int j = 1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=2*(bt-i); j++){
            System.out.print(" ");
        }
        for(int j = 1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
        
    }

    for(int i = bt; i>=1; i--){
        for(int j = 1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=2*(bt-i); j++){
            System.out.print(" ");
        }
        for(int j = 1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
        
    }
  }

//****
//****
//****
//****

public static void Square(int sq){
    for(int i=1; i<=sq; i++){
        for(int j=1; j<=sq; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

//Right pyramid
// *
// **
// ***
// ****

public static void right(int r){
    for(int i =1 ; i<=r; i++){
        for(int j = 1; j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println();
}

// ****
// ***
// **
// *
public static void righti(int ri){
    for(int i = ri; i>=1; i--){
        for(int j = 1; j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

//      *
//     * * 
//    * * * 
//   * * * * 
//  * * * * * 
// * * * * * * 

public static void triangle_star(int ts){
    for(int i = 1; i<=ts; i++){
        for(int j = 1; j<=(ts-i);j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print(" * ");
        }
        System.out.println();
    }
}
// 1 2 3 4 5 6 
//  2 3 4 5 6 
//   3 4 5 6 
//    4 5 6 
//     5 6 
//      6 

public static void rev_triangle(int num){
    for(int i=1; i<=num; i++){
         for(int j= 1; j<i; j++){
            System.out.print(" ");
        }
        for(int j=i; j<=num; j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

// 1 2 3 4 5 6 
//  2 3 4 5 6 
//   3 4 5 6 
//    4 5 6 
//     5 6 
//      6 
//     5 6 
//    4 5 6 
//   3 4 5 6 
//  2 3 4 5 6 
// 1 2 3 4 5 6 


public static void mirror_img(int N){
     for(int i=1; i<=N; i++){
         for(int j= 1; j<i; j++){
            System.out.print(" ");
        }
        for(int j=i; j<=N; j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }
     for(int i=N; i>=1; i--){
         for(int j= 1; j<i; j++){
            System.out.print(" ");
        }
        for(int j=i; j<=N; j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

//      *
//     * *
//    *   *
//   *     *
//  *       *
// ***********
 public static void hollow_triangle(int T) {
        for(int i = 1; i <= T; i++) {
            // Print leading spaces
            for(int j = 1; j <= T - i; j++) {
                System.out.print(" ");
            }
            // Print stars and spaces
            for(int j = 1; j <= (2 * i - 1); j++) {
                // Print '*' for the first and last row and the first and last column
                if(i == T || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

// 19. 
// ***********
//  *       *
//   *     *
//    *   *
//     * *
//      *

public static void reverse_hollow(int H){
            for(int i = H; i >= 1; i--) {
            // Print leading spaces
            for(int j = 1; j <= H - i; j++) {
                System.out.print(" ");
            }
            // Print stars and spaces
            for(int j = 1; j <= (2 * i - 1); j++) {
                // Print '*' for the first and last row and the first and last column
                if(i == H|| j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
}

//      *
//     * *
//    *   *
//   *     *
//  *       *
// *         *
//  *       *
//   *     *
//    *   *
//     * *
//      *

public static void printPattern(int n)
    {
        int i, j;
        int num = 1;
        // outer loop to handle upper part
        for (i = 1; i <= n; i++) {
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print stars
            for (j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // outer loop to handle lower part
        for (i = n-1; i >= 1; i--) {
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print stars
            for (j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    
    
    public static void main(String args[]){
        square(5);
        patteren(4);
        invert(4);
        abd(4);
        oddzero(4);
        patternone(4);
        pallindrome_triangle(4);
        pt(4);
        rhombus(4);
        diamond(4);
        butterfly(4);
        Square(4);
        right(4);
        righti(4);
        triangle_star(4);
        rev_triangle(4);
        mirror_img(4);
        hollow_triangle(4);
        reverse_hollow(4);
        printPattern(4);

    }
}