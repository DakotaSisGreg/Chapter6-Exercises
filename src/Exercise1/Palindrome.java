package Exercise1;

public class Palindrome implements ITester<String>{

    @Override
    public boolean test(String str) {
        str = str.replaceAll("[\\W_]+", "").toLowerCase(); // Remove non-alphanumeric characters and convert to lower case
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
