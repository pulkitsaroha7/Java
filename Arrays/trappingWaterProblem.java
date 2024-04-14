public class trappingWaterProblem {
    public static int trappingWater(int heights[]){
        int size = heights.length, leftMax[] = new int[size], rightMax[] = new int[size], trapWater = 0;

        leftMax[0] = heights[0]; rightMax[size-1] = heights[size-1];
        for(int i = 1 ; i<size ; i++){
            leftMax[i] = Math.max(leftMax[i-1], heights[i]);
        }
        for(int i = size-2 ; i >= 0 ; i--){
            rightMax[i] = Math.max(rightMax[i+1], heights[i]);
        }
        for(int i = 0; i<size ; i++){
            trapWater = trapWater + (Math.min(leftMax[i], rightMax[i]) - heights[i]);
        }

        return trapWater;
    }
    public static void main(String[] args) {
        int heights[] = {4,2,0,6,3,2,5}, waterTrapped = trappingWater(heights);
        System.out.println("Water trapped: " + waterTrapped);
    }
}
