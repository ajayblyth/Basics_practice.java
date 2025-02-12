package String;

import java.util.HashSet;

public class Remove_Duplicates {
    public static void main(String[] args) {
        {
            String str = new String(" ajay");
            StringBuilder result = new StringBuilder();
            HashSet<Character> set = new HashSet<>();
           for(int i = 0; i <str.length(); i++){
               char ch = str.charAt(i);
               if(!set.contains(ch)){
                   set.add(ch);
                   result.append(ch);
               }

           }
            System.out.println(result);
        }
    }
}
