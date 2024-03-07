public class binomialCoefficient {
    public static int factorial(int n) {
        int result = 1;
        if (n<0){
            return -1;
        }
        if (n == 1 || n==0){
            return 1;
        }
        result = n * factorial(n-1);
        return result;
    }
    public static int bCoefficient(int n, int r) {
        int result = factorial(n)/(factorial(r) * factorial(n-r));
        return result;
    }
    public static void main(String[] args) {
        System.out.println(bCoefficient(7, 3));
        System.out.println(bCoefficient(4, 3));
        System.out.println(bCoefficient(2, 5));
    }
}
