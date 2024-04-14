public class selectionSort {
    public static void sortSelection(int arr[]){
        for(int i = 0; i<arr.length - 1 ; i++){
            int minPos = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){ // (arr[minPos] < arr[j])--> for descreasing order
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,7,2,3,8};
        sortSelection(arr);
        for(int i = 0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
