package array.arrayPractice;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 8, 7, 0, 6, 4, 0, 0, 5, 4, 3, 2, 0};
        int left = 0;
        for (int right = 0; right < arr.length; right++) {

            if (arr[right] != 0) {

                if (left != right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
                left++;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
