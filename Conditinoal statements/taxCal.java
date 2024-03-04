import java.util.*;
public class taxCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salary;
        System.out.print("Enter your salary: ");
        salary = input.nextFloat();
        if (salary < 500000){
            System.out.println("Tax: " + (salary * 0));
        }
        else if (salary >= 500000 && salary <= 1000000){
            System.out.println("Tax: " + (salary * 0.2));
        }
        else{
            System.out.println("Tax: " + (salary * 0.3));
        }
    }
}
