public class q4 {
    public static int trapWater(int heights[]){
        int size = heights.length, leftmax [] = new int[size], rightmax [] = new int[size], trapWater = 0;
        leftmax[0] = heights[0] ; rightmax[size-1] = heights[size-1];
        for(int i = 1 ; i<size ; i++){
            leftmax[i] = Math.max(leftmax[i-1], heights[i]);
        }
        for(int j = size-2 ; j>=0 ; j--){
            rightmax[j] = Math.max(rightmax[j+1], heights[j]);
        }
        for(int k = 0; k<size ; k++){
            trapWater += Math.min(leftmax[k], rightmax[k]) - heights[k];
        }
        return trapWater;
    }
    public static void main(String[] args) {
        int heights[] = {4, 2, 0, 3, 2, 5};
        System.out.println("Water Trapped = "+trapWater(heights));
    }
}
