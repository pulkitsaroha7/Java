import java.util.*;
public class Q1 {
    public static void main(String[] args) {
    //          Write a program that reads a set of integers, and then prints the sum of the
    //          even and odd integers.
        Scanner input = new Scanner(System.in);
        int range, sumEven = 0, sumOdd = 0;
        System.out.print("Enter the range: ");
        range = input.nextInt();
        for(int i = 2; i<= range; i++ ){
            if(i % 2 == 0){
                sumEven +=  i;
            }
            else{
                sumOdd += i;
            }
        }
        System.out.println("Sum of even numbers within range: " + sumEven);
        System.out.println("Sum of odd numbers within range: " + sumOdd);
    }
}
