import java.util.*;
public class sumOfnaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int range, num = 1, sum = 0;
        System.out.print("Enter the range of natural numbers: ");
        range = input.nextInt();
        while(num<=range){
            sum += num;
            num++;
        }
        System.out.println("Sum of first " + range + " natural numbers is: " + sum);
        input.close();
    }
}
