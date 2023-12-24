package integer.reverseInteger;

import java.util.Scanner;

import static integer.reverseInteger.ReverseInteger.reverse;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bir eded daxil edin!");
        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();

        reverse(number);
    }
}
