package array.arrayPractice;

public class MissingNumber {
    public static void main(String[] args) {
        int[] number = {1,2,3,5,6,7,8,9};
        int n = number.length +1;
        int expectedSum = (n*(n+1))/2;
        int actualSum = 0;

        for(int c: number){
            actualSum += c;

        }
        int missingNumber = expectedSum - actualSum;

        System.out.println(missingNumber);
    }
}
