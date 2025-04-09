public class ArmStrongNumber {
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
