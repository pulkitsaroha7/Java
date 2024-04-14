public class q3 {
    public static void transpose(int matrix[][]){
        int col = matrix[0].length, row = matrix.length, transposed[][] = new int[col][row];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                transposed[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transposed Matrix: ");
        for(int i = 0 ; i<transposed.length ; i++){
            for(int j = 0 ; j<transposed[0].length ; j++){
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3}, {4,5,6}};
        System.out.println("Original Matrix: ");
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[0].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        transpose(matrix);
    }
}
