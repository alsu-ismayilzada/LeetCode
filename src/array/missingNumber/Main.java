package array.missingNumber;


import array.missingNumber.FindNumber;

public class Main {
    public static void main(String[] args) {
        int [] arr= new int [100];
        for(int i=0;i<80;i++){
            arr[i]=i;
        }
    FindNumber.findNumber(arr);
    }



}