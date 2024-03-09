public class floydTriangle {
    public static void Pattern(int lines){
        int num = 1;
        for(int row = 1; row<= lines ; row++){
            for(int col = 0; col<row ; col++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        } 
    }
    public static void main(String[] args) {
        Pattern(5);
    }
    
}
