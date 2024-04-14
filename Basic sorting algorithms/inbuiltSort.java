import java.util.Arrays;
import java.util.Collections;
public class inbuiltSort {
    public static void printArray(Integer arr[]){
        for(int i = 0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = {5,4,1,7,2,3,8};
        Arrays.sort(arr); printArray(arr);

        Arrays.sort(arr, 0 , 4);/*(arr, inclusive, exclusive)*/ printArray(arr);

        Arrays.sort(arr, Collections.reverseOrder());/* for reverse order, doesn't work on int, float or other primitive variables. Only work on object variables.*/ printArray(arr);
        Arrays.sort(arr, 0 , 4, Collections.reverseOrder()); printArray(arr);
    }
}
