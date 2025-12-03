public class string_rev_o1 {

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

    }

    public static void main(String[] args) {
        string_rev_o1 obj = new string_rev_o1();
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        obj.reverseString(s);
        System.out.println(s);
    }
}
