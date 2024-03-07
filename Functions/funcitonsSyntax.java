import java.util.*;;

public class funcitonsSyntax{
    public static void printHello(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public static int printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return 3;
    }
    public static int calculateSum(int a, int b){
        return (a + b);
    }

    public static void main(String[] args) {
    // Funtoins are a block of code which helps us to re-use specific lines of code within block multiple times. Functions who are defnied within a class are called Methods
    // Syntax:
    //              returnType name(){
    //                  body
    //                  reutrn
    //              }
    // Synatx with parameters: 
    //          returnType name(returnType param 1, returnType param2.... param n){
    //               body
    //               return
    //           }
        printHello();
        int val = printHelloWorld(), a,b;
        System.out.println("Val = " + val);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = input.nextInt();
        System.out.print("Enter the value of b: ");
        b = input.nextInt();
        System.out.println("Sum of a and b is: " + calculateSum(a, b));
        input.close();
    }
}