package array;


public class ArrayBasics {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,};
        first(numbers);
        search(numbers);

    }
    public static void first(int[] numbers){
        System.out.println(numbers[0]);   //access
        System.out.println(numbers[0]=11);   //update
//        System.out.println(Arrays.toString(numbers));
        for(int a: numbers){
            System.out.print(a+" ");
        }
        for(int i =0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
    public static void search(int[] numbers){
        int key = 11;
        int index = -1;
        boolean found = false;
        for( int i = 0; i < numbers.length; i++) {
            if (i == key) {
                found = true;
                 index  = i;
                break;
            }
        }
if(found){
    System.out.println(" number is at index =" + index);
}
    }
}
