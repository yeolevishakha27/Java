public class SUBARRAY {
    public static void subarr(int numbers[]) {
        int ts = 0; // Total number of subarrays
        int minSum = Integer.MAX_VALUE; // Initialize to a very large value
        int maxSum = Integer.MIN_VALUE; // Initialize to a very small value

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0; // Sum of the current subarray

                // Print elements of the subarray and calculate its sum
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }

                // Update minimum and maximum subarray sums
                minSum = Math.min(minSum, sum);
                maxSum = Math.max(maxSum, sum);

                // Print sum of the current subarray
                System.out.println("=> Sum: " + sum);
                ts++; // Increment total subarray count
            }
            System.out.println(); // Print a new line after each starting index
        }

        // Print results
        System.out.println("Total Subarrays are: " + ts);
        System.out.println("Minimum Subarray Sum: " + minSum);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        subarr(numbers);
    }
}
