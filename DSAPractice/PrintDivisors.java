public class PrintDivisors {
    public static void main(String[] args) {
        int n = 36;
        // int i = 1;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if((n/i) != i ){
                    System.out.println(n/i);
                }
            }
        }

        // while (i <= 36) {
        //     if(n % i == 0)
        //         System.out.println(i);
        //     i++;
        // }
    }
}
