package Basics;

public class BasicsDoneWithAjay {

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(divide(50, 5));
        System.out.println(addStrings(" ajay", "sharma"));
        example();
        evenOdd();
        primeNumbers(17);
        reverseString("ajay");
        maxNum(new int[]{23,45,31,56,78});

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static String addStrings(String str1, String str2) {
        return str1 + str2;

    }

    public static void example() {
        int num1 = 10;
        String str = String.valueOf(num1);
        System.out.println("value = " + str);

    }

    public static void evenOdd() {

        for (int i= 1; i<=100; i++){

            if (i %2 ==0){
                System.out.println(i + " number is even" );
            }
            else{
                System.out.println(i + " number is odd");
            }
        }}

    public static void primeNumbers(int number)
    {
        boolean flag =false;
        if( number ==1 || number == 2 ){
            System.out.println(number + " number is Prime");
        } else{

            for (int i = 2; i <number; i++){

                if(number % i == 0)
                {
                    System.out.println( number + " number is not Prime");
                    flag =true;
                    break;
                }
            }
            if (flag == false){
                System.out.println( number + " number is Prime");
            }
        }
    }
    public static void reverseString(String str){
        char str2 [] = str.toCharArray();
        int size =str2.length-1;

        for (int i = 0; i <str2.length/2; i++ ){
            char temp = str2[i];
            str2[i] =  str2[size];
            str2[size] = temp;
            size--;
        }
        System.out.println(str2);
    }

    public static int maxNum(int[] arr){
        int max = arr[0];
        for (int i =0; i< arr.length;i++ ){
//            23,45,31,56,34
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println( max);
        return max;
    }


}




