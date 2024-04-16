public class checkEquals {
    public static void main(String[] args) {
        String str1 = "Pulkit";
        String str2 = "Pulkit";
        String str3 = new String("Pulkit");

        if(str1 == str2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    // It will return false due to concept of internation, '==' checks at object levels not the values, in Java. 
        if(str1 == str3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(str1.equals(str3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
