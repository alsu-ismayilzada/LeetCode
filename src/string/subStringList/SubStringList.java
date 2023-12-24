package string.subStringList;

public class SubStringList {
    public static void subStringList(String str){

        for (int i=0; i<=str.length(); i++){
            for (int j=i+1; j<=str.length(); j++){
                System.out.println(j +" "+ str.substring(i,j));
            }
        }

    }
}
