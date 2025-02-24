package String.practice;

public class vowelConsonants {
    public static void main(String[] args) {
        String str = new String("aeioudfgdfg");
        char[] str1= str.toCharArray();
        int vCount = 0;
        int cCount = 0;
        for(char c  : str1){
            if(c == 'a'|| c=='e'|| c == 'i'|| c=='o'|| c == 'u'){
                vCount++;
            }
            else{
                cCount++;
            }
        }
        System.out.println("vowels = " + vCount + " consonants = " + cCount);
    }

}
