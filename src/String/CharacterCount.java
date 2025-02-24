package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
    public static void countCharacters(String str) {

//        maintain insertion order
        LinkedHashMap<Character, Integer> frequencyMap = new LinkedHashMap<>();

        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) { // Ignore non-alphabetic characters
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0)+1); // check last of code
            }
        }

        // Print  character counts in readable format
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) { // check last of code

            System.out.println(entry.getKey() + ": " + entry.getValue()); // check last
        }
    }

    public static void main(String[] args) {
        countCharacters("Hello, World! 123 $$$");
    }
}
//Notes:
//                   getOrDefault(ch, 0):
//                If ch exists in frequencyMap, it returns its current count.
//                If ch does not exist, it returns 0 as the default value.
//                If we use get(ch) directly when ch is missing, it returns null,
//                and null + 1 causes a NullPointerException.


//What is entrySet()?
//entrySet() is a method of the Map interface.
//It returns a Set<Map.Entry<K,V>>, meaning it provides a Set of key-value pairs from the Map.


//        entry.getKey() → Retrieves the character (key).
//        entry.getValue() → Retrieves the frequency (value).