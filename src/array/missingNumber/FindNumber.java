package array.missingNumber;

public class FindNumber {
    public static void findNumber(int arr[]) {

        int k=0;

        for(int j=1;j<=100;j++){
            for(int i=0;i<80;i++){
                if(j==arr[i]){
                    k++;
                }
            }
            if(k==0){
                System.out.println(j);
            }
            k=0;
        }
    }
}
