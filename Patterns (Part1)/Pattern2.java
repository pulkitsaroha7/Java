import java.util.*;
public class Pattern2{
    public static void main(String[] args) {
    // Pattern: 
    //                      ****
    //                      ***
    //                      **
    //                      *
        Scanner input = new Scanner(System.in);
        int lines;
        System.out.print("Enter the number of lines: ");
        lines = input.nextInt();
        for(int row = 0 ; row < lines ; row++){
            for(int col = 0; col <= lines-row-1 ; col++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
