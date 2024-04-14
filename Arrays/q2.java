import java.util.*;
public class q2 {
    public static int index(int nums[], int target){
        int start = 0, end = nums.length-1; 
        while(start<=end){
            if(nums[start] == target){
                return start;
            }
            if(nums[end] == target){
                return end;
            }
            start++;end--;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums[] = {4, 5, 6, 7, 0, 1, 2}, target;
        System.out.print("Enter the target value: ");
        target = input.nextInt();
        System.out.println("index: "+index(nums, target));
    }
}
