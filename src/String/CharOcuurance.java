package String;

public class CharOcuurance {
    public static void main(String[] args) {
        String str = "sharma";
        char ch = 'a';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Occurrences of " + ch  + " = " + count);
    }
}

