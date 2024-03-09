public class hollowReactangle {
    public static void Pattern(int totalRows, int totalColumns){
        for(int row = 1; row <= totalRows ; row++){
            for(int column = 1; column<= totalColumns; column++){
                if(row == 1 || row == totalRows || column == 1 || column == totalColumns){
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
        Pattern(4,5);
    }
}