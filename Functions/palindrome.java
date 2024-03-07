public class palindrome {
    public static boolean isPal(int num){
        int pal = 0, lastDigit = 0, org = num;
        while(num != 0){
            lastDigit = num % 10;
            pal = pal * 10 + lastDigit;
            num = num/10;
        }
        if (pal == org){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPal(983));
    }
}
