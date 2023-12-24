package integer.reverseInteger;

public class ReverseInteger {

    public static void reverse(Integer number) {
        Integer newNumber = 0, teklik = 0;

        while(number/10 != 0) {
            teklik = number % 10;
            number = number / 10;
            newNumber = newNumber * 10 + teklik;

        }
        newNumber = newNumber * 10 + number;

        System.out.println(newNumber);




    }
}
