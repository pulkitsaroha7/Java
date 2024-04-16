public class LettersToUppercase {
    public static String Uppercase(String str) {
        StringBuilder sb = new StringBuilder();
        // Character ch = Character.toUpperCase(str.charAt(0));
        // sb.append(ch);
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i = 1 ; i<str.length() ; i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]) {
        String str = "hi, this is a tutorial";
        System.out.println(Uppercase(str));
    }
}
