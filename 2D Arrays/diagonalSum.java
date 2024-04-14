public class diagonalSum {
    public static void DiagonalSum(int matrix[][]){
        int pd = 0, sd=0;// pd: i==j    &   sd: i+j = n-1
        for(int i = 0 ; i<matrix.length ; i++){
            pd+=matrix[i][i];
            if(i != matrix.length-1-i){// This solves common element probelms
                sd +=matrix[i][matrix.length-1-i];
            }
        }
        System.out.println("Sum of diagonals: "+(pd + sd));
    }
    public static void main(String[] args){
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        DiagonalSum(matrix);
    }
}
