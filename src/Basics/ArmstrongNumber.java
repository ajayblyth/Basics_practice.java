package Basics;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();
        int originalNumber = num;
        int sum = 0;
        var digits = String.valueOf(num).length();
        while(num>0){
            int digit = num % 10;
            sum += (int) Math.pow(digit, digits);
             num /= 10;
        }
        if (sum == originalNumber){
            System.out.println("number is armstrong");

        }
        else{
            System.out.println("number is not armstrong");
        }
     scanner.close();

    }


}