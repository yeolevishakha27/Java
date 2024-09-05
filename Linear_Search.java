import java.util.Scanner;

public class Linear_Search {
    public static int linearSearch(int[] marks, int key) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearStringSearch(String[] dish, String key) {
        for (int i = 0; i < dish.length; i++) {
            if (dish[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // For integer array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();

        int index = linearSearch(marks, key);
        if (index == -1) {
            System.out.println("No element found");
        } else {
            System.out.println("Element is found at: " + index);
        }

        // For string array
        System.out.print("Enter the number of elements: ");
        int N = sc.nextInt();
        sc.nextLine(); // Consume the newline

        String[] dish = new String[N];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < N; i++) {
            dish[i] = sc.nextLine();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < N; i++) {
            System.out.println(dish[i]);
        }
        System.out.print("Enter the key to search: ");
        String stringKey = sc.nextLine();

        int stringIndex = linearStringSearch(dish, stringKey);
        if (stringIndex == -1) {
            System.out.println("No element found");
        } else {
            System.out.println("Element is found at: " + stringIndex);
        }

        sc.close();
    }
}
