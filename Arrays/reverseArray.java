public class reverseArray {
    public static void reverse(int numbers[]){
        int start = 0 , end = numbers.length - 1;
        while(start < end){             // No swap case
            if(numbers[start] == numbers[end]){
                start += 1;
                end -= 1; 
            }else{                      // Swap case
                numbers[start] = numbers[start] + numbers[end];
                numbers[end] = numbers[start] - numbers[end];
                numbers[start] = numbers[start] - numbers[end];
                start += 1;
                end -= 1;
            }
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,6,4,8,3,9,2,0,1,4,45,466,43,25,325,62,135,62,3,31,67,2,5};
        System.out.print("original: ");
        for(int i = 0; i<numbers.length ; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        reverse(numbers);
        System.out.print("reversed: ");
        for(int i = 0; i<numbers.length ; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
