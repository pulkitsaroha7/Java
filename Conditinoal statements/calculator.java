import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        float a, b; char op;
        System.out.print("Enter the value of a: ");
        a = input.nextInt();
        System.out.print("Enter the operator ('+', '-', '*', '/', '%'): ");
        op = input.next().charAt(0);
        System.out.print("Enter the value of b: ");
        b = input.nextInt();
        
        switch(op){
            case '+': System.out.println((int)a + " " + op + " " + (int)b + " " + "=" + " " + (a + b)); break;
            case '-': System.out.println((int)a + " " + op + " " + (int)b + " " + "=" + " " + (a - b)); break;
            case '*': System.out.println((int)a + " " + op + " " + (int)b + " " + "=" + " " + (a * b)); break;
            case '/': System.out.println((int)a + " " + op + " " + (int)b + " " + "=" + " " + (a / b)); break;
            case '%': System.out.println((int)a + " " + op + " " + (int)b + " " + "=" + " " + (a % b)); break;
            default: System.out.println("Wrong operator selected");
        }
        input.close();
    }
}
