public class switchCase {
    public static void main(String[] args) {
    // Synatx for switch case:
    //             char var = a;
    //             switch(variable){ // Will match value of variable with cases
    //                 case a : code (if true);
    //                 case b : code (if true);
    //                 case c : code (if true);
    //                      .               
    //                      .
    //                      .
    //                 case n : code (if true);        
    //                 default : code (if all above caess are false, default case will execute);
    //             }

    
        int number = 2;
        switch(number){
            case 1 : System.out.println("Its 1");
                        break;
            case 2 : System.out.println("Its 2");
                        break;
            case 3 : System.out.println("Its 3");
                        break;
            default: System.out.println("Its " + number);
        }
    }
}
