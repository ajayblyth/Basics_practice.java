package array.arrayPractice;
import java.util.Arrays;

import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
     reverseArray();
     reverseUsingStream();

    }
    public static void reverseArray() {
        int[] arr = {1, 2, 3, 4, 5};

        for(int i =0; i< arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
           arr[ arr.length-i-1]= temp;

        }
        System.out.println(Arrays.toString(arr));

    }
    public static void reverseUsingStream() {
        int[] arr = {1, 2, 3, 4, 5};
            int[] reversed = IntStream.range(0, arr.length)
                    .map(i -> arr[arr.length - 1 - i])
                    .toArray();

        System.out.println(Arrays.toString(reversed));
    }



}