public class compressStrings {
    public static String compress(String str) {
        StringBuilder newStr = new StringBuilder();
        // int count = 0 ;        //--> Way 1: My way  O(n)
        // char element = str.charAt(0);
        // for(int i = 0; i<str.length() ; i++){
        //     if(str.charAt(i) != element){
        //         newStr.append(element);
        //         if(count>1){
        //             newStr.append(count);
        //         }
        //         element = str.charAt(i);
        //         count = 1;
        //     }
        //     else{
        //         count++;
        //     }
        // }
        // newStr.append(element);
        // if (count > 1) {
        //     newStr.append(count);
        // }

        for(int i = 0 ; i<str.length() ; i++){  // O(n)
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count > 1){
                newStr.append(count);
            }
        }
        return newStr.toString();
    }

    public static void main(String args[]) {
        String str = "aabbccdd";
        System.out.println("Compressed string: " + compress(str));
    }
}
