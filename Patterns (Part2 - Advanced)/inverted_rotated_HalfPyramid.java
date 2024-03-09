public class inverted_rotated_HalfPyramid {
    public static void Pattern (int totalRows){
        for(int row = 0 ; row<totalRows ; row++){
            for(int column = 0; column<totalRows; column++){
                if(column >= totalRows - row - 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern(20);
    }
}
