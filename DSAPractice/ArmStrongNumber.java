public class ArmStrongNumber {
//    An Armstrong number is an integer that is equal to the sum of its digits,
//    each raised to the power of the total number of digits in the number
//    e.g., 153 = (1^3) + (5^3) + (3^3)
//    e.g., 9474 = (9^4) + (4^4) + (7^4) + (4^4)
    public static void main(String[] args) {
        int n = 370;
        int sum = 0;
        int temp = n;
        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum + (int)Math.pow(lastDigit, 3);
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong number");
    }
}
