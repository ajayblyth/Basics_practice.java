package array.arrayPractice;


public class MInAndMax {
    public static void main(String[] args) {
        int[] arr = {11,23,44,5,67,5,7,33,6,7,345};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0; i< arr.length; i++){
             if (arr[i]>max){
                 max =arr[i];
             }if(arr[i]<min){
                 min = arr[i];
            }
        }
        System.out.println("min = " + min + " max = " + max);
    }
}
