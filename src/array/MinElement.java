package array;

import java.util.Arrays;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {23,56,45,34,67,89};
        usingStream(arr);
        usingForLoop(arr);
    }

    public static void usingForLoop(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element: " + min);
    }

        public static void usingStream(int[] arr){

            int min = Arrays.stream(arr).min().getAsInt();
            System.out.println("Minimum element: " + min);

    }

}
