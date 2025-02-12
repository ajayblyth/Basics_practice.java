package array;
import java.util.Arrays;

import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
     reverseArray();
     reverseUsingStream();
     usingArrayMethod();
    }
    public static void reverseArray() {
        int[] arr = {1, 2, 3, 4, 5};

        int[] reversed = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length- 1 - i];
        }
        System.out.println("Reversed Array: " + java.util.Arrays.toString(reversed));
    }

        public static void usingArrayMethod() {
            int[] arr = {1, 2, 3, 4, 5};
            int[] reversed = new int[arr.length];
            Arrays.setAll(reversed, i -> arr[arr.length - 1 - i]);

            System.out.println(Arrays.toString(reversed));
        }
    public static void reverseUsingStream() {
        int[] arr = {1, 2, 3, 4, 5};
            int[] reversed = IntStream.range(0, arr.length)
                    .map(i -> arr[arr.length - 1 - i])
                    .toArray();

        System.out.println(Arrays.toString(reversed));
    }



}