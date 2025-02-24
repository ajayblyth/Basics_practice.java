package String;


import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "aabbgAhcvgdgcvdhcv";
        String inp = input.toLowerCase();

        // Create a map to store character counts
        Map<Character, Integer> map = new HashMap<>();

        // Iterate through the string and count each character
        for (char ch : inp.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Print the character counts
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static class CharCountMap {
        public static void main(String[] args) {
            String str= " bhsbdububrfbsbuktriqwtyrfhixbcnx";
            HashMap<Character, Integer> map = new HashMap<>();
            for( char ch : str.toCharArray()){

                map.put(ch, map.getOrDefault(ch , 0)+ 1);
            }
            for(Map.Entry<Character, Integer>  entry : map.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());

            }

        }
    }
}
