public class pairsInArray {
    public static void Pairs(int numbers[]) {
        for(int i = 0; i<numbers.length; i++){
            System.out.print("Pairs of "+ numbers[i] +" : ");
            for(int j = i+1; j<numbers.length; j++){
                if(numbers[j] == numbers[i]){
                    continue;
                }else{
                    System.out.print("("+numbers[i] + ", " + numbers[j] + ")");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
// *IMP* Formula for total number of pairs:
//          totol pairs =  1 + 2 + 3  + 4 .... n
//          totol pairs = (n*(n-1))/2
        int numbers[] = {2,6,4,8,3,9,2,0,1,4,45,466,43,25,325,62,135,62,3,31,67,2,5};
        Pairs(numbers);
    }
}
