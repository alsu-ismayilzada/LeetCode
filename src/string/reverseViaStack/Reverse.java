package string.reverseViaStack;

import java.util.Stack;

public class Reverse {
    public static void reverse(String str) {

        Stack<Character> string = new Stack<>();
        Character[] newStr = new Character[str.length()];

        for(int i=0; i<str.length(); i++) {

            string.push(str.charAt(i));
        }

        int i=0;
        while (!string.isEmpty()){
            newStr[i] = string.pop();
            i++;
        }
        for(int j=0; j<newStr.length; j++){
            System.out.print(newStr[j]);
        }
    }
}
