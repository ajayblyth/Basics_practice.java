package String.practice;

public class reverse {
    public static void main(String[] args) {
        String str = "abc";
        char[] charArray = str.toCharArray();
        int size = charArray.length;
        for(int i= 0; i< size/2;i++){
            char temp = charArray[i];
            charArray[i]= charArray[size-i-1];
            charArray[size-i-1] = temp;
        }
        System.out.println(charArray);
    }
}
