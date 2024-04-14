public class spiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0, startCol = 0, endRow = matrix.length - 1, endCol = matrix[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // Top
            for (int i = startCol; i <= endCol; i++) { 
                System.out.print(matrix[startRow][i] + " ");
            }
            // Right
            for (int i = startRow + 1; i <= endRow; i++) { 
                System.out.print(matrix[i][endCol] + " ");
            }
            // Bottom
            for (int i = endCol - 1; i >= startCol; i--) { 
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][i] + " ");
            }
            // Left
            for (int i = endRow - 1; i >= startRow+1; i--) { 
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        printSpiral(matrix);
    }
}
