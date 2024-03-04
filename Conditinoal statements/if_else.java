import java.util.*;
public class if_else{
    public static void main(String[] args) {
        //          If - else block syntax:
        //          if(condition){
        //              code
        //          }
        //          else{
        //              code
        //          }
        int age = 19;
        if (age>=18){
            System.out.println("Adult: Drive, Vote");
        }
        else{
            System.out.println("Not adult");
        }



        // If-else ladder:
        age = 15;
        if (age>=18){
            System.out.println("Adult: Drive, Vote");
        }
        else if (age >= 13 && age <= 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not adult");
        }

        // Multiple If statements:
        age = 12;
        if (age>=18){
            System.out.println("Adult: Drive, Vote");
        }
        if (age >= 13 && age <= 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not adult");
        }
    }
}