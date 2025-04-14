public class Recursion {
    public static void main(String[] args) {
        sum(0);
    }

    public static void sum(int a){
        if (a == 3) {
            return;
        }
        System.out.println(a);
        a++;
        sum(a);
    }
}
