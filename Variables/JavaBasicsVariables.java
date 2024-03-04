// import java.util.*; // For input
// public class JavaBasicsVariables{
//     public static void main(String args[]){
        // System.out.print("****\n");
        // int a=5, b=10;
        // String name = "Tony";
        // System.out.print(a); // println or \n - To move to a new line
        // System.out.println(b);
        // System.out.println(name);

        // Scanner sc = new Scanner(System.in); // For input but make sure to import java.util.*

        // System.out.print("Enter any word: ");
        // String input = sc.next(); // .next() captures input till a space, after space it ignores everything
        // System.out.println(input);
        // sc.nextLine();
        // System.out.print("Enter any string:");
        // String input2 = sc.nextLine(); // .nextLine() captures full string 
        // System.out.println(input2);

        // System.out.print("Enter any Integer:");
        // int input3 = sc.nextInt(); // .nextInt() captures full integer 
        // System.out.println(input3);

// **IMP**: Type/Widening/Implicit Conversion: It is a converison of data types from smaller to a bigger and compatibale data type. It is an implicit(done by java only or without data loss conversion) conversion. byte -> short -> int -> float -> long -> double (inverse not possible). Ex:
        // int a = 5;
        // long b = a; // --> This conversion is possible
        // float input = sc.nextInt(); // --> This conversion is possible
        // char ch = 'a';
        // int num = ch;
        // System.out.println(num);
        // System.out.println(input);
        // System.out.println(b);

        // long c = 5;
        // int d = c; // --> This is not possible, conversion error
        // int input = sc.nextFloat(); // --> This is not possible, conversion error
        // System.out.println(input);
        // System.out.println(d);

// **IMP**: widening/expicit Conversion or Type Castting: It is a converison of data types from one data type to another. It is an explicit(done forcibly by user with an intent of data loss) conversion.
        // float a = 75.99f;
        // int b = (int)a;
        // System.out.println(b);
// **VIMP**: Type promotion: It is only valid for expressions.
    // Type 1: Java automatically promotes 'each' byte,short or char to int. Ex:
        // byte a = 'a'; // a = 97
        // short b = 'b'; // b = 98
        // char c = 'c'; // c = 99
        // // int ans = c + b + a; // ans = 97 + 98 + 99 = 294
        // byte ans = (byte)(c + b + a);// Not possible as we can't convert int to byte, using lossy conversion(type casting) will result in a inrelivant answer.
        // System.out.println(ans);
    // Type 2: If 'one' operand is long, float or double the whole expression is converted to long, float or double. Ex:
        // float a1 = 3.4f;
        // int a2 = 45;
        // long a3 = 34;
        // double a4 = 5.6f;
        // double ans2 = a1 + a2 + a3 + a4;
        // System.out.println(ans2);

// ############################## Questions ####################################################################
//     }
// }
import java.util.*;
public class JavaBasicsVariables{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        // int a, b, c;
        // System.out.print("Enter any number: ");
        // a = sc.nextInt();
        // System.out.print("Enter any number: ");
        // b = sc.nextInt();
        // System.out.print("Enter any number: ");
        // c = sc.nextInt();
        // float ans = (a + b + c)/3;
        // System.out.println("average is : " + ans);

// Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

        float pencil, pen, eraser;
        System.out.print("Enter the cost of Pencil: ");
        pencil = input.nextFloat();
        System.out.print("Enter the cost of Eraser: ");
        eraser = input.nextFloat();
        System.out.print("Enter the cost of Pen: ");
        pen = input.nextFloat();
        float sum = pencil + eraser + pen, gst = (18 * sum)/100;
        System.out.println("GST: " + gst);
        System.out.println("Total Amount: " + (sum + gst));

    }
}