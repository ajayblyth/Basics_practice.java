package String;

public class AA_MethodswithExamples0 {
    public class StringMethodsExample {
        public static void main(String[] args) {
            String str = "Hello World";

            // length()
            System.out.println("Length: " + str.length()); // Output: 11

            // charAt(index)
            System.out.println("Character at index 0: " + str.charAt(0)); // Output: H

            // substring(start, end)
            System.out.println("Substring (1, 4): " + str.substring(1, 4)); // Output: ell
//         Note : remember inclusive/ exclusive approach here on substring, first inluded , last excluded, index starts from 0

            // contains(str)
            System.out.println("Contains 'Hello': " + str.contains("Hello")); // Output: true

            // indexOf(char)
            System.out.println("Index of 'e': " + str.indexOf('e')); // Output: 1

            // toUpperCase()
            System.out.println("Uppercase: " + str.toUpperCase()); // Output: HELLO WORLD

            // toLowerCase()
            System.out.println("Lowercase: " + str.toLowerCase()); // Output: hello world

            // replace(old, new)
            System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java")); // Output: Hello Java

            // split(delimiter)
            String[] words = str.split(" ");
            System.out.println("Split words:");
            for (String word : words) {
                System.out.println(word);
            }
            // Output:
            // Hello
            // World

            // trim()
            String strWithSpaces = "   Hello World   ";
            System.out.println("Trimmed: '" + strWithSpaces.trim() + "'"); // Output: 'Hello World'

            // equals(str2)
            System.out.println("Equals 'Hello World': " + str.equals("Hello World")); // Output: true

            // equalsIgnoreCase(str2)
            System.out.println("Equals Ignore Case 'hello world': " + str.equalsIgnoreCase("hello world")); // Output: true

            // concat(str2)
            System.out.println("Concatenation: " + str.concat("!!")); // Output: Hello World!!
        }
    }

}
