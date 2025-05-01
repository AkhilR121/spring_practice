public class CharacterHashing {
    public static void main(String[] args) {
        int asciiValue = (int) 'a';
        String str = "adfghafffz";
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - asciiValue]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                char ch = (char) (i + asciiValue);
                System.out.println(ch + " = " + count[i]);
            }
        }
    }
}
