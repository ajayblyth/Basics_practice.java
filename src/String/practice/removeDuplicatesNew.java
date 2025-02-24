package String.practice;

import java.util.LinkedHashSet;

public class removeDuplicatesNew {
    public static void main(String[] args) {
        String str = "aabbccdd";
        char[] str1 = str.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char c: str1){
            set.add(c);
        }
        System.out.println(set);
    }
}
