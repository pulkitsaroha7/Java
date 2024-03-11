public class BSearch {
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1; 
        while(start <= end){
            int mid = (end + start)/2;
            if(numbers[mid] == key){ // Matching
                return mid;
            }
            else if(numbers[mid]>key){ // Right side
                end = mid - 1;
            }
            else{ // Left side
                start = mid + 1;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
    // Pre-requisite for binary search:
    //          1) Array should br sorted
        int numbers[] = {2,4,6,8,10,12,14,16}, result = binarySearch(numbers, 16);
        if(result == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Match found at index: "+ result);
        }
        
    }
}
