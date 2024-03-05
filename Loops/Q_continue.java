import java.util.*;
public class Q_continue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        while(true){
            System.out.print("Enter any number: ");
            num = input.nextInt();
            if (num%10 == 0){
                System.out.println("You entered a multiple of 10, so number will not be printed :)");
                continue;
            }
            System.out.println(num);
        }
    }
}
