import java.util.*;
public class Intro {
    public static void printLetters(String str) {
        for(int i = 0 ; i<str.length() ; i++){
            System.out.print(str.charAt(i) + " ");// charAt() : can be spelled as 'char-at(index)' 
        }
        System.out.println();
    }
    public static void main(String args[]) {
        char arr[] = {'a' , 'b' , 'c' , 'd'};
    // Below 2 methods are programtically same but have difference in implementation.
        String str = "abcd";
        String str2 = new String("abc");

    // IMP: Strings in Java are IMMUTABLE.
        
        Scanner input = new Scanner(System.in);
        // String name = input.next(); // --> This take only a word as input
        // System.out.println(name);

        String firstName = input.nextLine(); // --> This takes full line as input
        System.out.println(firstName);

        System.out.println(firstName.length()); // --> Returns length of string including spaces, if any.

        String lastName = input.next();
        String fullName = firstName + " " + lastName; // --> Concatenation of strings
        System.out.println(fullName);
        printLetters(fullName); // --> Accesing each char in string just same as array
    }

}