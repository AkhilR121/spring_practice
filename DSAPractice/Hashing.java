public class Hashing {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 2, 2, 4};
        int[] count = new int[100]; //Hash Array

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]] = count[arr[i]] + 1;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(i + " appears " + count[i] + " times");
            }
        }
    }
}
