public class whileLoop{
    public static void main(String[] args) {
    // Syntax for while loop:
    //          while(condition){
    //              code
    //          }
    int counter = 1;
    while(counter <= 10){
        System.out.println("Hello World " + (counter));
        counter++;
    }
    System.out.println("Loop execution finished");
    }
}