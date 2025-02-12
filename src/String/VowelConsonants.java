package String;

public class VowelConsonants {
    public static void main(String[] args) {
        String str = "Hello World";
        str = str.toLowerCase();
        int vowels = 0;
        int consonants = 0;


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println(vowels + " vowels " + consonants + " consonants");
    }
}
