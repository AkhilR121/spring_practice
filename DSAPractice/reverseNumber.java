public class reverseNumber {
    public static void main(String[] args) {
        int n = 4321;
        int reverseNumber = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
        }
        System.out.println(reverseNumber);
    }
}

