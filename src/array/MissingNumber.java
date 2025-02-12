package array;

public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the sum of numbers from 1 to n
        int totalSum = n * (n + 1) / 2;

        // Calculate the sum of elements in the array
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }

        // The missing number is the difference
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        // Example input: array of size 5 with a missing number
        int[] arr = {1, 2, 4, 5}; // Missing 3
        int n = 5; // Length of the range (1 to 5)

        // Find the missing number
        int missingNumber = findMissingNumber(arr, n);

        // Print the result
        System.out.println("The missing number is: " + missingNumber);
    }
}
