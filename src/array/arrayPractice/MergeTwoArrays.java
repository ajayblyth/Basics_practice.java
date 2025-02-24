package array.arrayPractice;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {3,4,6,3,5,78,2,6,9,5};
        int[] arr2 = {2,4,68,98,5,3};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergeArray = new int[n1+n2];

        System.arraycopy(arr1,0,mergeArray,0,n1);
        System.arraycopy(arr2,0,mergeArray,n1,n2);
        Arrays.sort(mergeArray);
        System.out.println(Arrays.toString(mergeArray));

    }
}
