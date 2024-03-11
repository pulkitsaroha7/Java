public class arraysAsArguments {
    public static void update(int marks[]){
        for(int i = 0; i < marks.length ; i++){
            marks[i] += 1; 
        }
    }
    public static void main(String[] args) {
    // When we pass arrays as arguments for a function, they are passed by refernece. Java only follows pass by reference, means, any changes made in funciton will effect the original array. 
        int marks[] = new int[5];
        marks[0] = 50;
        marks[1] = 50;
        marks[2] = 50;
        update(marks);
        for(int i = 0; i < marks.length ; i++){
            System.out.println(marks[i]);;
        }
    }
}
