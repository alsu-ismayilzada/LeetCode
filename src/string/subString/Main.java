package string.subString;

import java.util.ArrayList;
import java.util.List;

import static string.subString.SubString.foo;

public class Main {
    public static void main(String[] args) {


        List<String> string = new ArrayList<>();
        string.add("Salam");
        string.add("alsu");
        string.add("alma");
        string.add("almaq");
        string.add("isteyirsen?");

        foo(string);
    }
}