package string.findPartOfString;

import static string.findPartOfString.FindOfPart.isSubstring;

public class Main {
    public static void main(String[] args) {
    // Eger stringin bir parcasidirsa true, deyilse false qaytarir.
        String mainString = "Hello, World!";
        String subString = "Hello";

        if (isSubstring(mainString, subString)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }


}
