package Basics;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

swap(a,b);
    }
    static void swap(int a , int b){
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
