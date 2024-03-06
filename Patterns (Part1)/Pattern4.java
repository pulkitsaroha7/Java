import java.util.*;
public class Pattern4{
    public static void main(String[] args) {
    // Pattern: 
    //                      A
    //                      BC
    //                      DEF
    //                      GHIJ
        Scanner input = new Scanner(System.in);
        int lines; char ch = 'A';
        System.out.print("Enter the number of lines: ");
        lines = input.nextInt();
        for(int row = 0 ; row < lines ; row++){
            for(int col = 0; col <= row; col++){
                System.out.print(ch);
                ch++;
            }
            System.out.print("\n");
        }
    }
}
