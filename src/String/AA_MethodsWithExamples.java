package String;

public class AA_MethodsWithExamples {

    public class StringBuilderStringBufferDemo {

        public static void main(String[] args) {
            // Using StringBuilder
            System.out.println("=== StringBuilder Example ===");
            StringBuilder sb = new StringBuilder("Hello");

            // Append - Adds string at the end
            sb.append(" World");
            System.out.println("After append: " + sb); // Output: Hello World

            // Insert - Inserts at a specific index
            sb.insert(6, "Beautiful ");
            System.out.println("After insert: " + sb); // Output: Hello Beautiful World

            // Replace - Replaces part of a string
            sb.replace(6, 15, "Amazing");
            System.out.println("After replace: " + sb); // Output: Hello Amazing World

            // Delete - Deletes characters from index range
            sb.delete(6, 13);
            System.out.println("After delete: " + sb); // Output: Hello World

            // Reverse - Reverses the string
            sb.reverse();
            System.out.println("After reverse: " + sb); // Output: dlroW olleH

            // Reversing back to original
            sb.reverse();

            // Capacity - Shows current capacity of StringBuilder
            System.out.println("Current capacity: " + sb.capacity()); // Default: 16 + length of string

            // Ensure Capacity - Ensures a minimum capacity
            sb.ensureCapacity(50);
            System.out.println("New capacity after ensuring: " + sb.capacity()); // Output: 50 or more

//            note : same method for stringBuffer
        }
    }

}
