public class functionOverloading {
/*1)*/public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
/*2)*/public static float add(int a, int b){
        return a+b;
    }
    public static float add(int a, int b, char c){
        return a+b+(float)c;
    }
    public static void main(String[] args) {
    // Function overloading is a part of OOPs. It means to create fuctions having same name but different parameters or we can say multiple functions with same name but different parameters. 
    // There should be atleast one out of following criteria of difference to do function overloading:
    //              1) Type of parameters
    //              2) Number of parameters  
    //              3) Or both  
    System.out.println(sum(5,2));
    System.out.println(sum(3,2,2));
    System.out.println(add(3,4));
    System.out.println(add(3,4, 'v'));
    }
}
