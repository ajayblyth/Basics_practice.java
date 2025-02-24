package String.practice;


import java.util.Arrays;

public class AnagramsChecker {
    public static void main(String[] args) {
      System.out.println(areAnagrams("liril", "lliir"));
        System.out.println(areAnagrams("ajay", "hfur"));

    }
    public static boolean areAnagrams(String first, String second){

        char[] arr1 =first.toCharArray();
        char[] arr2 = second.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

 return Arrays.equals(arr1,arr2);
}}
