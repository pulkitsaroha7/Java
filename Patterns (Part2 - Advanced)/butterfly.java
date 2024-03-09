public class butterfly {
    public static void Pattern(int lines){
        for(int row = 1; row<=lines; row++){
            for(int column = 1; column<=2*lines; column++){
                if(column <= row || column >= 2*lines+1-row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int row = 5; row<=2*lines; row++){
            for(int column = 1; column<=2*lines; column++){
                if(column >= row || column <= 2*lines+1-row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern(16);
    }
}
