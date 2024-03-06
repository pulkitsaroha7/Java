import java.util.*;
public class Pattern3{
    public static void main(String[] args) {
    // Pattern: 
    //                      1
    //                      12
    //                      123
    //                      1234
        Scanner input = new Scanner(System.in);
        int lines;
        System.out.print("Enter the number of lines: ");
        lines = input.nextInt();
        for(int row = 1 ; row <= lines ; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.print("\n");
        }
    }
}
