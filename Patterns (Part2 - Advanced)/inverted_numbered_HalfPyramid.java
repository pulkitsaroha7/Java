public class inverted_numbered_HalfPyramid {
    public static void Pattern(int lines){
        for(int row = 0; row< lines; row++){
            for(int column = 1; column <= lines - row ; column++){
                System.out.print(column);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Pattern(5);
    }
}
