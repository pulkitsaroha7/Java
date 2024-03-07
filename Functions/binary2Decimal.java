public class binary2Decimal {
    public static int b2D(int binary){
        int lastDigit, decimal = 0, power = 0;
        while(binary != 0){
            lastDigit = binary%10;
            decimal = decimal + (lastDigit * (int)Math.pow(2, power));
            binary = binary/10;
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(b2D(1100));
    }
}
