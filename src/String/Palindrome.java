package String;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome("liril");
    }
    public static void Palindrome(String str){
        char str2 [] = str.toCharArray();
        int size = str2.length-1;

        for (int i = 0; i <str2.length/2; i++ ){
            char temp = str2[i];
            str2[i] =  str2[size];
            str2[size] = temp;
            size--;
        }
        String reversed = new String(str2);

        if( str.equals(reversed) ){
            System.out.println(str + " String is palindrome");
        }else{
            System.out.println( str + " String is not palindrome");
        }
    }

}

