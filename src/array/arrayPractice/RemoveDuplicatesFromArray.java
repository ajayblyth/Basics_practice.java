package array.arrayPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] numbers = {11,23,5,35,77,8,3,6,7,8,5,3,4,6,8};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int n : numbers){
            set.add(n);

        }
int[] uniqueArray = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(uniqueArray));
    }

}
