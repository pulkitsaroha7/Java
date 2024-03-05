import java.util.*;
public class starPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    // Pattern:
    //                  ****
    //                  ****
    //                  ****
    //                  ****
        int lines;
        System.out.print("Enter the number of lines: ");
        lines = input.nextInt();
        for(int i = 0; i < lines ; i++){
            System.out.println("****");
        }
        input.close();
    }
}
