public class insertionSort {
    public static void sortInsertion(int arr[]){
        for(int i = 1 ; i<arr.length ; i++){
            for(int j = i; j>=0 ; j--){
                if(arr[i] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,7,2,3,8};
        sortInsertion(arr);
        for(int i = 0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
