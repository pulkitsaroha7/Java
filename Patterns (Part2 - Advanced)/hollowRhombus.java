public class hollowRhombus {
    public static void Pattern(int lines){
        int totalColumns = lines + (lines-1);
        for(int row = 0; row < lines ; row++){
            for(int column = 1; column<=totalColumns ; column++){
                if(column == lines-row || column == totalColumns-row || (column>=lines && row==0) || (row==lines-1 && column<=lines)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern(19);// Only works for odd natural numbers
    }
}
