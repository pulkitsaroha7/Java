public class callbyValue {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a within swap funtion: " + a);
        System.out.println("value of b within swap funtion: " + b);
    }
    public static void main(String[] args) {
    // When we pass varaibles as arguments, only the copy of value of variables is passed to the function, not the varaible as a whole, so the changes made in values exists till the scope of function ends or till when the function exists. After returning, function reomves from stack memory and its scope ends, hence, it doesn't exist, so the thing is orginial values of a variables aren't changed because we passed copy of value of variable not the variable. This is known as call by value. *** Java always follows Call by value ***
    
    // Call by reference: When we pass variabels(using their memory address) as arguments, hence, the change in values exists even after the scope of function ends or even after the function is returned. 
        int a = 5, b = 10;
        System.out.println("Value of a before swap: " + a);
        System.out.println("Value of b before swap: " + b);
        swap(a,b);// --> Call by value
        System.out.println("Value of a after swap: " + a);
        System.out.println("Value of b after swap: " + b);
    }
}
