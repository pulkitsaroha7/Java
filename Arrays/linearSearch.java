public class linearSearch {
    public static int lnrSearch(int ary[], int key) {
        for(int i = 0 ; i<ary.length ; i++){
            if(ary[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int ary[] = {2,4,6,8,10,12,14,16,18}, key = 0, index = lnrSearch(ary, key);
        if(index<0){
            System.out.println("Item not found");
        }else{
            System.out.println("Match found at index: " + index);
        }
    }
}
