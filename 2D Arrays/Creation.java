import java.util.*;

public class Creation {
    public static void search(int matrix[][] , int key){
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == key){
                    System.out.println("key found at (" + i +", " + j + ")");
                    break;
                }
            }
        }
        System.out.println("Key not found");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int rows = matrix.length , col = matrix[0].length;

        // In java, 2D arrays are not stored either in row major or in column major. In java each row creates its own array of equal lengths and these arrays are stored at random places in memory. 
        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j < col ; j++){
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println();
        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j < col ; j++){
                
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 5);
    }
    
}