package array.arrayPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class SortArrayBubble {
    public static void main(String[] args) {
        int[] numbers = {123,3,22,3,45,3,2,4,5,32,3,2,24,4,5,3,3455,12,343};

        for(int i=0; i<numbers.length; i++){
            for(int j= 0; j< numbers.length-1; j++){

                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                   numbers[j+1]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int n : numbers){
            set.add(n);
        }
        int[] uniqueAndSorted= set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(uniqueAndSorted));
    }
}
//Note: ✅ One for loop is NOT enough because it only makes one pass and doesn’t fully sort the array.
//✅ The inner loop (j loop) is needed to continuously swap adjacent elements in multiple passes.
//        ✅ Bubble Sort works by "bubbling" the largest elements to the right in each pass.