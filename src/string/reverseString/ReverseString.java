package string.reverseString;

public class ReverseString {
    public static void reverse(String str) {
        String newStr = "";

        for(int i=str.length()-1; i>=0; i--){
                newStr = newStr + str.charAt(i);
        }
        System.out.println(newStr);
    }
}
