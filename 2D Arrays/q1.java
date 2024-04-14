public class q1 {
    public static int counter(int matrix[][], int element){
        int count = 0;
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0; j<matrix[0].length ; j++){
                if(element == matrix[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int matrix[][] = {{4,7,8}, {8,8,7}}, count = -1;
        count = counter(matrix, 8);
        System.err.println("Count: " + count);
    }
}
