package string.findPartOfString;

public class FindOfPart {

    public static boolean isSubstring(String mainString, String subString) {
        int mainLength = mainString.length();
        int subLength = subString.length();

        for (int i = 0; i <= mainLength - subLength; i++) {
            int j;
            for (j = 0; j < subLength; j++) {
                if (mainString.charAt(i + j) != subString.charAt(j)) {
                    break;
                }
            }
            if (j == subLength) {
                return true;
            }
        }

        return false;
    }
}
