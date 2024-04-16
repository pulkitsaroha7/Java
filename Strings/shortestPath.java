public class shortestPath {
    public static float getPath(String path){
        double x = 0, y = 0; 
        for(int i = 0 ; i < path.length() ; i++){
            if(path.charAt(i) == 'W'){
                x += -1; 
            }
            else if(path.charAt(i) == 'S'){
                y += -1; 
            }
            else if(path.charAt(i) == 'N'){
                y += 1; 
            }
            else{
                x += 1;
            }
        }
        return (float)Math.sqrt((x*x) + (y*y));
    }

    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.println("Shortest Path: " + getPath(path) + " units");

    }
}
