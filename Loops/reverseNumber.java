import java.util.*;
public class reverseNumber {
    // Probelm 1:
    //                      input = 10899
    //                      print 99801 ()just printing reverse, nopt changing original number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, lastDigit = 0, num2;
        System.out.print("Enter the number: ");
        num1 = input.nextInt();
        num2 = num1;
        // Solution for Problem 1:
        System.out.print("Printing reverse: ");
        while(num1 != 0){
            lastDigit = num1%10;
            System.out.print(lastDigit);
            num1 = num1/10;
        }

    // Probelm 2:
    //                      input = 10899
    //                      output = 99801 (changing the orginal number)

        // Solution for Problem 2:
        while(num2 != 0){
            lastDigit = num2%10;
            num1 = num1*10 + lastDigit;
            num2 = num2/10;
        }
        System.out.println("\nReversed number = " + num1);
        System.out.println("\nCode execution finished");
        input.close();
    }
}
