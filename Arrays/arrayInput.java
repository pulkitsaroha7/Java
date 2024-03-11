import java.util.*;
public class arrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks[] = new int[5];
        System.out.println("Enter the marks: ");
        marks[0] = input.nextInt();
        marks[1] = input.nextInt();
        marks[2] = input.nextInt();
        System.out.println("Physics Marks: "+ marks[0]);
        System.out.println("Chemistry Marks: "+ marks[1]);
        System.out.println("Maths Marks: "+ marks[2]);
        marks[0] = marks[0] + 1;
        System.out.println("Updated Physics Marks: "+ marks[0]);
        System.out.println("Percentage: "+ (float)(marks[0] + marks[1] + marks[2])/3);
        System.out.println("Length of Array: " + marks.length);
    }
}
