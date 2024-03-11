public class largestInArray {
    public static int largestNum(int numbers[]){
        int largest = Integer.MIN_VALUE; // --> Min value assigns minimum integer value to the variable
        for(int i = 0; i<numbers.length ; i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {3,6,2,7,8,4}, largest = largestNum(numbers);
        System.out.println("Largest value in array: "+ largest);
    }
}
