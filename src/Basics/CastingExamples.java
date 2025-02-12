package Basics;

public class CastingExamples {

    public static void main(String[] args) {
        implicitCasting(); // Example of implicit casting
        explicitCasting(); // Example of explicit casting
        intToString();     // Example of int to String
        stringToInt();     // Example of String to int
        doubleToInt();     // Example of double to int
        intToDouble();     // Example of int to double
        stringToBoolean(); // Example of String to boolean
    }

    // Implicit Casting (Widening Conversion)
    public static void implicitCasting() {
        int intValue = 100;
        double doubleValue = intValue; // int to double (implicit)
        System.out.println("Implicit Casting (int to double): " + doubleValue);
    }

    // Explicit Casting (Narrowing Conversion)
    public static void explicitCasting() {
        double doubleValue = 99.99;
        int intValue = (int) doubleValue; // double to int (explicit)
        System.out.println("Explicit Casting (double to int): " + intValue);
    }

    // Convert int to String
    public static void intToString() {
        int intValue = 123;
        String strValue = String.valueOf(intValue); // int to String
        System.out.println("int to String: " + strValue);
    }

    // Convert String to int
    public static void stringToInt() {
        String strValue = "456";
        int intValue = Integer.parseInt(strValue); // String to int
        System.out.println("String to int: " + intValue);
    }

    // Convert double to int
    public static void doubleToInt() {
        double doubleValue = 123.45;
        int intValue = (int) doubleValue; // Explicit casting
        System.out.println("double to int: " + intValue);
    }

    // Convert int to double
    public static void intToDouble() {
        int intValue = 789;
        double doubleValue = intValue; // Implicit casting
        System.out.println("int to double: " + doubleValue);
    }

    // Convert String to boolean
    public static void stringToBoolean() {
        String strValueTrue = "true";
        String strValueFalse = "false";
        boolean boolValueTrue = Boolean.parseBoolean(strValueTrue); // String to boolean
        boolean boolValueFalse = Boolean.parseBoolean(strValueFalse); // String to boolean
        System.out.println("String 'true' to boolean: " + boolValueTrue);
        System.out.println("String 'false' to boolean: " + boolValueFalse);
    }
}

//Explanation of Each Method:
//Implicit Casting (Widening):
//
//Automatically converts a smaller type (e.g., int) to a larger type (e.g., double) without data loss.
//        Example: int → double.
//Explicit Casting (Narrowing):
//
//Manually converts a larger type (e.g., double) to a smaller type (e.g., int) with potential data loss.
//Example: double → int.
//Convert int to String:
//
//Use String.valueOf() to convert an integer to a string.
//Convert String to int:
//
//Use Integer.parseInt() to parse a numeric string into an integer.
//Convert double to int:
//
//Use explicit casting (int) to convert a floating-point value to an integer.
//        Convert int to double:
//
//Implicitly convert an integer to a double.
//Convert String to boolean:
//
//Use Boolean.parseBoolean() to convert "true" or "false" strings into boolean values (true or false).