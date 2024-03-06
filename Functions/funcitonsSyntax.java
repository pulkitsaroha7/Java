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
    public static void main(String[] args) {
    // Funtoins are a block of code which helps us to re-use specific lines of code within block multiple times. Functions who are defnied within a class are called Methods
    // Syntax:
    //              returnType name(){
    //                  body
    //                  reutrn
    //              }
        printHello();
        int val = printHelloWorld();
        System.out.println(val);
    }
}