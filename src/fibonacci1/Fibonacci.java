package fibonacci1;

public class Fibonacci {

    public static void fn(int n){

        int num1=0, num2=1;
        for(int i=0; i<n; i++){
            System.out.println(num1);

            int num3=num1+num2;
            num1=num2;
            num2=num3;
        }
    }


}

