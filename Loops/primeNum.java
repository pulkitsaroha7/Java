import java.util.*;
public class primeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, divisor = 0; boolean isPrime = true;
        System.out.print("Enter any number: ");
        num = input.nextInt();
        for(int i = 2 ; i <= Math.sqrt(num) ; i++){
            if(num % i == 0){
                isPrime = false;
                divisor = i;
                break;
            }
        }
        if (isPrime){
            System.out.println(num + " is a Prime number.");
        }
        else{
            System.out.println(num + " is not a Prime number, It is divided by: " + divisor);
        }
    }
}
