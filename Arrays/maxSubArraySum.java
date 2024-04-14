public class maxSubArraySum {
    public static int maxSum(int numbers[]){
        int maxSum = Integer.MIN_VALUE, currentSum = 0;
        for(int i = 0; i<numbers.length; i++){
            for(int j = i; j<numbers.length; j++){
                currentSum = 0;
                for(int k = i; k<=j; k++){
                    currentSum += numbers[k];
                }
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int numbers[] = {2,6,4,8,3,9,2,0,1,4,45,466}, sum = maxSum(numbers);
        System.out.println("Maximum sum: "+sum);
    }
}
