public class subArrays {
    public static void subarrays(int numbers[]){
        for(int i = 0; i<numbers.length; i++){
            for(int j = i; j<numbers.length; j++){
                for(int k = i; k<=j; k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,6,4,8,3,9,2,0,1,4,45,466};
        subarrays(numbers);
    }
}
