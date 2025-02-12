package String;


import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "aabbghcvgdgcvdhcv";

        // Create a map to store character counts
        Map<Character, Integer> map = new HashMap<>();

        // Iterate through the string and count each character
        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Print the character counts
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
