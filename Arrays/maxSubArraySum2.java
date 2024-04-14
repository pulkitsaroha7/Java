public class maxSubArraySum2 {
    public static int maxSum(int numbers[]){
        int maxSum = Integer.MIN_VALUE, currentSum = 0;
        int prefixArray[] = new int[numbers.length];
        prefixArray[0] = numbers[0];
        for(int i = 1; i<numbers.length; i++){
            prefixArray[i] = prefixArray[i-1] + numbers[i];
        }
        for(int start = 0; start<numbers.length; start++){
            for(int end = start; end<numbers.length; end++){
                currentSum = start == 0 ? prefixArray[end] : prefixArray[end] - prefixArray[start-1]; 
            }
            if(maxSum < currentSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int numbers[] = {2,6,4,8,3,9,2,0,1,4,45,466}, sum = maxSum(numbers);
        System.out.println("Maximum sum: "+sum);
    }
}
