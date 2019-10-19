public class ArmstrongNumbers {

    public static boolean isArmstrongNumber(int number) {

        String numberAsString = number + "";
        int numberOfDigits = numberAsString.length();
        int copyOfNumber = number;
        int sum = 0;
        while (copyOfNumber != 0) {
            int lastDigit = copyOfNumber % 10;
            sum = sum + (int) Math.pow(lastDigit, numberOfDigits);
            copyOfNumber = copyOfNumber / 10;
        }

        return sum == number; //skrocony zapis if return true else return false

        /*if (sum == number) {
            return true;
        } else {
            return false;*/
    }
}
