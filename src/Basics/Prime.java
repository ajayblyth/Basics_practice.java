package Basics;

public class Prime {
    public static void main(String[] args) {
        boolean result=prime(7);
        if(result == true){
            System.out.println("number is Prime");
        }else{
        System.out.println("number is not Prime");
    }}
    public static boolean prime(int num) {
        if (num <= 1) {
            System.out.println(num + "number is not Prime");
        }

        for (int i = 2; i <= num /2; i++) {
            if (num %  i == 0) {
                return false;
            }
        }
        return true;
    }
}
