public class pallindrome {
    public static void main(String[] args) {
        int n = 121;
        int reverseNumber = 0;
        int currentNum = n;
        while (n > 0) {
            int lastDigit = n % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            n = n / 10;
        }

        if (reverseNumber == currentNum) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
