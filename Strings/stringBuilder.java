public class stringBuilder {
    public static void main(String[] args) {
    // String builder are strings that are mutable and are memory efficient than Strings. String builder has all fuctions and methods as String. 
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a' ; ch<='z' ; ch++){
            sb.append(ch);
        }
        System.out.println(sb + " " + sb.length());
    }
}
