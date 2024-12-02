public class Reverse_array {
    public static void main(String[] args){
        int numbers[] = {2, 4, 6, 8, 10};

        reverse(numbers); // Reverse the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " "); // Print reversed array
        }
        System.out.println();
    }

    // Method to reverse the array
    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;

        // Swap elements from both ends moving towards the center
        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
}
