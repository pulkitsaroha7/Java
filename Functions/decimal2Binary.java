public class decimal2Binary {
    public static int d2B(int decimal){
        int binary = 0, remainder, power = 0;
        while(decimal > 0){
            remainder = decimal % 2;
            binary = binary + (remainder * (int)Math.pow(10,power));
            decimal = decimal/2;
            power++;
        }
        return binary;
    }
    public static void main(String[] args) {
        System.out.println("Answer: " + d2B(12));
    }
}
