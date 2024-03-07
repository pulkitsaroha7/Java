public class sumOfDigits {
    public static int sum(int number){
        int sum = 0;
        while(number != 0){
            sum = sum + (number % 10);
            number = number/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum of digits is : " + sum(1574));
    }
}
