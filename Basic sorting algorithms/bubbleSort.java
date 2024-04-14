public class bubbleSort{
    public static void sortBubble(int nums[]){
        for(int i = 0; i<nums.length-1 ; i++){
            int swap = 0;
            for(int j = 0; j<nums.length-1-i ; j++){
                if(nums[j] > nums[j+1]){ // Without swap Complexity: O(n^2)
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        sortBubble(nums);
        for(int i = 0; i<nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }
}