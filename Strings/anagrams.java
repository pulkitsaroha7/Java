import java.util.Arrays;

public class anagrams {
    public static boolean isAnagram(String str1, String str2){
    // Convert to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
    // Check the lengths are equal or not, if equal: 
        if(str1.length() == str2.length()){
        // Convert to character array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
        // Sort the arrays
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
        // If both arrays are equal than true else false
            boolean result = Arrays.equals(str1charArray, str2charArray);
            return result;
        } 
    // if not equal:
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str1 = "race", str2 = "caree";
        System.out.println("Strings are anagram: " + isAnagram(str1,str2));
    }
}
