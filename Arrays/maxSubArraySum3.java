public class maxSubArraySum3 {
    public static int kadane(int numbers[]){
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        boolean isNegative = true;
    // Ans to Q:              {{
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] > 0){
                isNegative = false;
            }
        }
        if (isNegative){
            maxSum = numbers[0];
            for(int i = 0; i<numbers.length; i++){
                currentSum = numbers[i];
                if (maxSum<currentSum){
                    maxSum = currentSum;
                }
            }
            return maxSum;
        }/*                     }}                                                   */
        else{
            for(int i = 0; i<numbers.length; i++){
                currentSum = currentSum + numbers[i];
                if(currentSum<0){
                    currentSum = 0;
                }
                maxSum = Math.max(maxSum, currentSum);
            }
            return maxSum;
        }
        
    }
    public static void main(String[] args) {
    // Q) If all numbers are negative in an array then kadane's algorithm will return 0. To solve this update the code for negative ones
    // Hint: Remove all numbers whose are very big and negative, this will help kadane to return minimum negative sum of elements. 
        // int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int numbers[] = {-11,11,2,-4};
        int sum = kadane(numbers);
        System.out.println("Maximum sum: "+sum);
    }
}
