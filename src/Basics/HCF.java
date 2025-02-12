package Basics;

public class HCF {
    public static void main(String[] args) {
int a= 45;
int b = 75;

        HcfFinder(a, b);
    }
    public static void HcfFinder(int a, int b){

        while(b !=0){
            int temp = b;
            b = a % b;
            a = temp;
//            Euclidean Algorithm Steps:
//            Divide the larger number by the smaller number.
//            Find the remainder of the division.
//            Replace the larger number with the smaller number, and the smaller number with the remainder.
//            Repeat the process until the remainder is 0.
//            The non-zero remainder at the end of the process is the GCD.

        }
        System.out.println( a);


    }
}
