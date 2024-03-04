import java.util.*;
public class ternaryOp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //  Ternary operator syntax:
    //      variable = (condition)? statement1 (if true condition) : statement 2 (if false condition)
        int num;
        System.out.print("Enter num: ");
        num = input.nextInt();
        boolean ans = (num>10)? true : false;
        System.out.println("num is greater than 10: " + ans);

      //  Largest of 3 using Ternary operators:
        int a,b,c,largest;
        System.out.print("Enter A: ");
        a = input.nextInt();
        System.out.print("Enter B: ");
        b = input.nextInt();
        System.out.print("Enter C: ");
        c = input.nextInt();

        largest = (a>=b)? ((a>=c)? a : c) : ((b>=c)? b : c);
        System.out.println("Largest is "+ largest);
    }
}
