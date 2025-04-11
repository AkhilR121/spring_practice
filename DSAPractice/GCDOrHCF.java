public class GCDOrHCF {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 40;
        int gcd = 0;
        // for (int i = 1; i < Math.min(n1, n2); i++) {
        //     if (n1 % i == 0 &&  n2 % i == 0) {
        //         gcd = i;
        //     }
        // }
        for (int i = Math.min(n1, n2); i >= 1; i--) {
            if (n1 % i == 0 &&  n2 % i == 0) {
                gcd = i;
                break;
            }
        }
        System.out.println(gcd);
    }
}
// NOTE: TimeComplexity: O(min(n1, n2))