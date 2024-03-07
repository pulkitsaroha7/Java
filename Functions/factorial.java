public class factorial {
    public static int fact(int n){// Without recurrsion
        int result = 1;
        for(int i = 1; i<=n ; i++){
            result *= i;
        }
        return result;
    }

    public static int factRec(int n) {// Using recurrsion
        int result = 1;
        if (n == 1){
            return 1;
        }
        result = n * factRec(n-1);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(fact(4));
        System.out.println(factRec(5));
    }
}
