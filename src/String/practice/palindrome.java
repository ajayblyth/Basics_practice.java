package String.practice;

public class palindrome {

        public static void main(String[] args) {
            String str = "liril";
            char[] charArray = str.toCharArray();
            int size = charArray.length;
            for(int i= 0; i< size/2;i++){
                char temp = charArray[i];
                charArray[i]= charArray[size-i-1];
                charArray[size-i-1] = temp;
            }
            String reversed = new String(charArray);
        if(str.equals(reversed)){
            System.out.println("palindrome");

        }else{
            System.out.println(" not palindrome");
        }
        }
    }


