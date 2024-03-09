public class numberPyramid {
    public static void Pattern(int lines) {
        for(int row = 0 ; row<lines ; row++){
            for(int col = 1; col<=lines+row ; col++){
                if(col>=lines-row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
    }
}
