import java.util.Scanner;

public class ArmstrongNumbers {

    public static boolean isArmstrongNumber(int number) {

        String inputAsString = number + "";
        int numberOfDigits = inputAsString.length();
        int copyOfNumber = number;
        int sum = 0;
        while (copyOfNumber != 0) {
            int lastDigit = copyOfNumber % 10;
            sum = sum + (int) Math.pow(lastDigit, numberOfDigits);
            copyOfNumber = copyOfNumber / 10;
        }
        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }
}