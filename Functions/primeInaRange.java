import java.util.*;
public class primeInaRange {
    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n) ; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, end;
        System.out.println("Enter the range: ");
        System.out.print("Starting point: ");
        start = input.nextInt();
        System.out.print("Ending point: ");
        end = input.nextInt();
        for(int i = start; i<=end; i++){
            if (isPrime(i) == true){
                System.out.print(i+" ");
            }
        }
        System.out.println("\nAre all prime numbers in given range");
    }
}
