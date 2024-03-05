import java.util.*;
public class Q2 {
    public static void main(String[] args) {
    //          Write a program that reads a set of integers, and then prints the sum of the
    //          even and odd integers.
        Scanner input = new Scanner(System.in);
        int num, fact = 1;
        System.out.print("Enter the num: ");
        num = input.nextInt();
        for(int i = num; i>0; i-- ){
            fact *= i; 
        }
        System.out.println("Factorial of " + num + " is: " + fact);

    }
}

