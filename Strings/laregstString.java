public class laregstString {
    public static void main(String[] args) {
        String fruits[] = {"banana" , "apple" , "orange"};
    // Task: To find out largest string according to Lexicographic order.
        
        // str1.compareto(str2) --> Finds largest string in lexographical order. Its returns: 
        //          0 : if strings are equal
        //          <0 : if str1 < str2
        //          >0 : if str1 > str2
        // str1.comparetoignorecase --> This function is same as 'compareto' but it igonres upper cases of strings. 'A' == 'a'(Lexographically) for this function.
        
        String largest = fruits[0];
        for(int i = 0 ; i<fruits.length ; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println("Largest is: " + largest);
    }
}
