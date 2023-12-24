package string.subString;
import java.util.List;
public class SubString {

    public static void foo(List<String> string) {

        for(int i=0; i<string.size(); i++){
            String str=string.get(i).substring(0,2);
            if(str.equals("al")){
                System.out.println(string.get(i));
            }
        }

    }
}
