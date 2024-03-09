public class diamond {
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
        for(int row = 0; row<lines ; row++){
            for(int col = 0; col<(2*lines)-1-row ; col++){
                if(col>=row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern(7);
    }
    
}
