import java.util.*;
public class q_Break {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        while(true){
            System.out.print("Enter any number: ");
            num = input.nextInt();
            if (num%10 == 0){
                System.out.println("You entered a multiple of 10, so loop broke :)");
                break;
            }
        }
    }
}
