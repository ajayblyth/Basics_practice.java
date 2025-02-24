package String.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount1 {
    public static void main(String[] args) {
       characterFrequency("Hello World");
    }
    public static void characterFrequency(String str){

        LinkedHashMap< Character, Integer> map = new LinkedHashMap<>();
        str.toLowerCase();
        char[] charArray = str.toCharArray();
        for(char c : charArray){
            if(Character.isLetter(c)){
                map.put(c, map.getOrDefault(c,0)+1);

            }

        }
        for(Map.Entry<Character, Integer>entry : map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


    }
}
