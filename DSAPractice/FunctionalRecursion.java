public class FunctionalRecursion {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);
    }

    public static int sum(int n) {
        if(n == 0) {
            return 0;
        }
        else{
            return n + sum(n - 1);
        }
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }
}
