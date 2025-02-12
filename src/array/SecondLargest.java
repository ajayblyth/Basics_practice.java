package array;

    import java.util.*;

    public class SecondLargest {
        public static void main(String[] args) {
            int[] arr = {12, 35, 1, 10, 34, 1};

            // Without Stream (Using Loop)
            int secondLargestLoop = findSecondLargestWithoutStream(arr);
            System.out.println("Second largest (without Stream): " + secondLargestLoop);

            // With Stream
            int secondLargestStream = findSecondLargestWithStream(arr);
            System.out.println("Second largest (with Stream): " + secondLargestStream);
        }

        // Method to find the second largest element without Stream (Using Loop)
        public static int findSecondLargestWithoutStream(int[] arr) {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > largest) {
                    secondLargest = largest;  // Update second largest
                    largest = num;            // Update largest
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;      // Update second largest
                }
            }

            return secondLargest;
        }

        // Method to find the second largest element using Stream
        public static int findSecondLargestWithStream(int[] arr) {
            return Arrays.stream(arr)
                    .distinct()
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .skip(1)
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Array must contain atleast two distinct values"));


        }

    }

