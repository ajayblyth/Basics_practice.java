package String;

public class Reverse_palindrome_anagram {
    public static void main(String[] args) {
        palindrome("liril");
    }
    public static void palindrome(String str){

         char str1[] = str.toCharArray();
        int size = str1.length;

        for( int i = 0; i <size/2; i++) {
           char temp = str1[i];
           str1[i] = str1[size-i-1];
           str1[size-i-1] = temp;
        }
        System.out.println(str1);
       String reversed = new String(str1);
        if (str.equals(reversed)) {

            System.out.println("String is a palindrome");
        }
        else {
            System.out.println("its not");
        }
    }

}
