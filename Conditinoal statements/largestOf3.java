import java.util.*;
public class largestOf3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter A: ");
        a = input.nextInt();
        System.out.print("Enter B: ");
        b = input.nextInt();
        System.out.print("Enter C: ");
        c = input.nextInt();

        if (a>= b && a>= c){
            System.out.println("A is largest");
        }
        else if (b>=c){
            System.out.println("B is largest");
        }
        else{
            System.out.println("C is largest");
        }
        // Better way is to use Ternary operator
    }
}
