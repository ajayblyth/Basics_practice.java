package practice;

public class CharOccurance {
    public static void main(String[] args) {
        String str = " Aa aa";
        countChar(str);

    }
    public static void countChar(String str){
        var lowerCase = str.toLowerCase();
        char ch = 'a';
        int count = 0;
        for(int i = 0; i <lowerCase.length(); i++) {

            if (lowerCase.charAt(i) == ch) {
                count++;
            }
            }
        System.out.println("CharOccurance : " + count);
        }
}
