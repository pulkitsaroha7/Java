public class searchSorted {
    public static void staircaseSearch(int matrix[][], int key){
        int row = matrix.length-1 , col = 0;
        while(row>=0 && col<matrix[0].length){
            System.out.println("Currently at element: " + matrix[row][col]);
            if(key == matrix[row][col]){
                System.out.println("Key found at (" + row + ", " + col + ")");
                return;
            }
            else if(key < matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key not found!!");
    }

    public static void main(String[] args){
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 }};
        staircaseSearch(matrix, 39);
    }
}
